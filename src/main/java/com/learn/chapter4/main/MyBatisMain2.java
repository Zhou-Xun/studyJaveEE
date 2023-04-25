package com.learn.chapter4.main;

import com.learn.chapter4.dao.RoleDao;
import com.learn.chapter4.pojo.Role;
import com.learn.chapter4.utils.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.logging.Logger;

public class MyBatisMain2 {
    public static void main(String[] args) {
        // 日志对象
        Logger logger = Logger.getLogger(String.valueOf(MyBatisMain2.class));
        SqlSession sqlSession = null;
        try {
            // 获取sqlSession
            sqlSession = SqlSessionFactoryUtils.openSqlSession();
            // 获取映射器
            RoleDao roleDao = sqlSession.getMapper(RoleDao.class);
            // 执行映射器，返回结果
            List<Role> roles = roleDao.findRoles("2000");
//            List<Role> roles = roleDao.findRoles2("", "33");
//            List<Role> roles = roleDao.findRolesBind("", "33");
            System.out.println(roles);

            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            for (Role role : roles) {
                System.out.println("show each role: " + role);
            }
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }
}
