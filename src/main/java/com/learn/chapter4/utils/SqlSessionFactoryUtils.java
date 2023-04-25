package com.learn.chapter4.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class SqlSessionFactoryUtils {

    // 互斥锁
    private final static Class<SqlSessionFactoryUtils> LOCK
            = SqlSessionFactoryUtils.class;

    private static SqlSessionFactory sqlSessionFactory = null;

    private SqlSessionFactoryUtils() {}

    public static SqlSessionFactory getSessionFactory() {
        synchronized (LOCK) {
            if (sqlSessionFactory != null) {
                return sqlSessionFactory;
            }
            // 配置文件
            String configFile = "mybatis-config.xml";
            InputStream inputStream;
            try { // 构建SqlSessionFactory
                inputStream = Resources.getResourceAsStream(configFile);
                sqlSessionFactory
                        = new SqlSessionFactoryBuilder().build(inputStream);
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }
            return sqlSessionFactory;
        }
    }

    // 构建SqlSession对象
    public static SqlSession openSqlSession() {
        // 如果SqlSessionFactory没有被构建，则构建它
        if (sqlSessionFactory == null) {
            getSessionFactory();
        }
        // 获取SqlSession对象
        return sqlSessionFactory.openSession();
    }
}
