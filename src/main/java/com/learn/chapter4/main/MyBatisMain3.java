package com.learn.chapter4.main;

import com.learn.chapter4.dao.RoleDao;
import com.learn.chapter4.pojo.Role;
import com.learn.chapter4.utils.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.logging.Logger;

public class MyBatisMain3 {
    public static void main(String[] args) {
        // 日志对象
        Logger logger = Logger.getLogger(String.valueOf(MyBatisMain3.class));
        SqlSession sqlSession = null;
        try {
            Role role = new Role();
            role.setId(1L);
            role.setRoleName("t88888888888888888");
//            role.setNote("t1234");

            // 获取sqlSession
            sqlSession = SqlSessionFactoryUtils.openSqlSession();
            // 获取映射器
            RoleDao roleDao = sqlSession.getMapper(RoleDao.class);
            // 执行映射器，返回结果
            roleDao.updateRole(role);
            sqlSession.commit();
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            System.out.println(roleDao.getRole(1L));
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }
}
