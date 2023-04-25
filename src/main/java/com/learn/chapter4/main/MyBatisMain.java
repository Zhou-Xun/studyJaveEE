package com.learn.chapter4.main;

import com.learn.chapter4.dao.RoleDao;
import com.learn.chapter4.pojo.Role;
import com.learn.chapter4.utils.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.logging.Logger;

public class MyBatisMain {
    public static void main(String[] args) {
        // 日志对象
        Logger logger = Logger.getLogger(String.valueOf(MyBatisMain.class));
        SqlSession sqlSession = null;
        try {
            // 获取sqlSession
            sqlSession = SqlSessionFactoryUtils.openSqlSession();
            // 获取映射器
            RoleDao roleDao = sqlSession.getMapper(RoleDao.class);
            // 执行映射器，返回结果
            Role role = roleDao.getRole(100L);
            System.out.println(role);
//            logger.info(role.getRoleName());
//            int count = roleDao.countByNote("test");
//            System.out.println("Count test note: " + count);
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }
}
