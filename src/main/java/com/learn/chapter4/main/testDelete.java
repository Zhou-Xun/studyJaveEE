package com.learn.chapter4.main;

import com.learn.chapter4.dao.RoleDao;
import com.learn.chapter4.utils.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;

public class testDelete {
    public static void main(String[] args) {
        SqlSession sqlSession = null;
        try {
            // 获取sqlSession
            sqlSession = SqlSessionFactoryUtils.openSqlSession();

            RoleDao roleDao = sqlSession.getMapper(RoleDao.class);
            int i = roleDao.deleteRole(4L);
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
