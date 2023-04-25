package com.learn.chapter9.interceptor;

import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Signature;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.SystemMetaObject;
import org.apache.log4j.Logger;
//import java.util.logging.Logger;
import java.sql.Connection;
import java.util.Properties;

@Intercepts({
        @Signature(type = StatementHandler.class, // 拦截对象
                method = "prepare", // 拦截方法
                args = {Connection.class, Integer.class}) // 拦截方法参数
})

public class MyPlugin implements Interceptor {
    private Logger log = Logger.getLogger(MyPlugin.class);
    private Properties props;

    /**
     * 插件方法, 代替StatementHandler的prepare方法
     * @param invocation
     * @return 返回预编译后的PreparedStatement方法
     * @throws Throwable
     */
    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        // 获取需要拦截的目标对象
        StatementHandler statementHandler = (StatementHandler) invocation.getTarget();
        // metaObject绑定目标对象
        MetaObject metaStatementHandler = SystemMetaObject.forObject(statementHandler);
        Object object = null;
        /**
         * 分离代理对象链, 目标对象可能被多个插件拦截, 并产生多个代理
         * 我们需要通过循环分离出最原始的目标类
         */
        while (metaStatementHandler.hasGetter("h")) {
            object = metaStatementHandler.getValue("h");
            metaStatementHandler = SystemMetaObject.forObject(object);
        }
        statementHandler = (StatementHandler) object;
        // 获取当前调用的SQL
        String sql = (String) metaStatementHandler.getValue("delegate.boundSql.sql");
        // 获取当前参数
//        Long parameterObject = (Long) metaStatementHandler.getValue("delegate.boundSql.parameterObject");
        // 打印日志
        log.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        log.info("执行的SQL: " + sql);
//        log.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
//        log.info("参数: " + parameterObject);
        log.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        log.info("before proceed");
        Object obj = invocation.proceed();
        log.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        log.info("after proceed");
        return obj;
    }

    /**
     * 生成代理对象
     * @param target 被拦截对象
     * @return 代理对象
     */
    @Override
    public Object plugin(Object target) {
        // 采用
        return Interceptor.super.plugin(target);
    }

    @Override
    public void setProperties(Properties properties) {
//        Interceptor.super.setProperties(properties);
        this.props = properties;
        log.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        log.info("dbType: " + this.props.get("dbType"));
    }
}
