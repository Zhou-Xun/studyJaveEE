package com.learn.chapter4.main;

import com.learn.chapter4.dao.RoleDao;
import com.learn.chapter4.pojo.Role;
import com.learn.chapter4.utils.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class MyBatisMainList {
    public static void main(String[] args) {
        // 日志对象
        Logger logger = Logger.getLogger(String.valueOf(MyBatisMainList.class));
        SqlSession sqlSession = null;
        try {
            List<Long> roleIdList = new ArrayList<>(List.of(1L, 100L, 1000L));
            // 获取sqlSession
            sqlSession = SqlSessionFactoryUtils.openSqlSession();
            // 获取映射器
            RoleDao mapper = sqlSession.getMapper(RoleDao.class);
            // 执行映射器，返回结果
            List<Role> roles = mapper.getRoleByList(roleIdList);

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
