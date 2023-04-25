package com.learn.chapter5.main;

import com.learn.chapter4.dao.RoleDao;
import com.learn.chapter4.main.MyBatisMain;
import com.learn.chapter4.pojo.Role;
import com.learn.chapter4.utils.SqlSessionFactoryUtils;
import com.learn.chapter5.mapper.EmployeeMapper;
import com.learn.chapter5.pojo.Employee;
import org.apache.ibatis.session.SqlSession;

import java.util.logging.Logger;

public class testAssociation {
    public static void main(String[] args) {
        // 日志对象
        Logger logger = Logger.getLogger(String.valueOf(MyBatisMain.class));

        try (SqlSession sqlSession = SqlSessionFactoryUtils.openSqlSession();){
            // 获取映射器
            EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
            // 执行映射器，返回结果
            Employee employee = mapper.getEmployee(2L);
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            logger.info(employee.getBirthday().toString());
            logger.info(employee.getSex().toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
