package com.learn.chapter4.main;

import com.learn.chapter4.dao.RoleDao;
import com.learn.chapter4.pojo.Role;
import com.learn.chapter4.utils.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.logging.Logger;

public class testInsert {
    public static void main(String[] args) {
        // 日志对象
        Logger logger = Logger.getLogger(String.valueOf(MyBatisMain.class));
        SqlSession sqlSession = null;
        try {
            // 获取sqlSession
            sqlSession = SqlSessionFactoryUtils.openSqlSession();

            Role role = new Role();
            role.setRoleName("xunTest20230423");
            role.setNote("notexunTest20230423");

            RoleDao roleDao = sqlSession.getMapper(RoleDao.class);
            // 操作影响的条数
            int i = roleDao.insertRole(role);
            sqlSession.commit();
            System.out.println("===============================");
            System.out.println(role);
            System.out.println("what is i : " + i);
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }

}
