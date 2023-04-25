package com.learn.chapter4.main;

import com.learn.chapter4.dao.RoleDao;
import com.learn.chapter4.pojo.PageParams;
import com.learn.chapter4.pojo.Role;
import com.learn.chapter4.pojo.RoleParams;
import com.learn.chapter4.utils.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class testMultiParameter {
    public static void main(String[] args) {
        try (SqlSession sqlSession1 = SqlSessionFactoryUtils.openSqlSession();) {
            // 获取映射器
            RoleDao mapper = sqlSession1.getMapper(RoleDao.class);
//            HashMap<String, Object> parameterType = new HashMap<>();
//            parameterType.put("roleName", "1");
//            parameterType.put("note", "1");
            // 执行映射器方法，返回结果
//            List<Role> roleList = mapper.findRolesByMap(parameterType);
//            List<Role> roleList = mapper.findRolesByAnnotation("1", "1");
            RoleParams roleParams = new RoleParams();
            roleParams.setNote("1");
            roleParams.setRoleName("1");

            PageParams pageParams = new PageParams();
            pageParams.setStart(0);
            pageParams.setLimit(1);

            List<Role> roleList = mapper.findByMix(roleParams, pageParams);
            System.out.println(roleList);
//            List<Role> roleList = mapper.findRolesByBean(roleParams);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
