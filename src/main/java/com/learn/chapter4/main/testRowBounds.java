package com.learn.chapter4.main;

import com.learn.chapter4.dao.RoleDao;
import com.learn.chapter4.pojo.Role;
import com.learn.chapter4.utils.SqlSessionFactoryUtils;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.logging.Logger;

public class testRowBounds {
    public static void main(String[] args) {
        // 日志对象
        Logger logger = Logger.getLogger(String.valueOf(MyBatisMain.class));
        SqlSession sqlSession = null;
        try {
            // 获取sqlSession
            sqlSession = SqlSessionFactoryUtils.openSqlSession();
            // 获取映射器
            RoleDao roleDao = sqlSession.getMapper(RoleDao.class);

            RowBounds rowBounds = new RowBounds(0, 1);
            // 执行映射器，返回结果
            List<Role> role = roleDao.findByRowBounds("1", "1", rowBounds);
            System.out.println("==============================");
            System.out.println("result" + role);
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }

}
