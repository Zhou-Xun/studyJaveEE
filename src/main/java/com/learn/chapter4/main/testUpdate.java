package com.learn.chapter4.main;

import com.learn.chapter4.dao.RoleDao;
import com.learn.chapter4.pojo.Role;
import com.learn.chapter4.utils.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;

public class testUpdate {
    public static void main(String[] args) {
        SqlSession sqlSession = null;
        try {
            // 获取sqlSession
            sqlSession = SqlSessionFactoryUtils.openSqlSession();

            Role role = new Role();
            role.setId(20001L);
            role.setRoleName("test33");
            role.setNote("test33");

            RoleDao roleDao = sqlSession.getMapper(RoleDao.class);
            int i = roleDao.updateRole(role);
            sqlSession.commit();
            System.out.println("===============================");
            System.out.println(i);
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }
}
