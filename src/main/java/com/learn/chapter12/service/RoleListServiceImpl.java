package com.learn.chapter12.service;

import com.learn.chapter12.pojo.Role;

import com.learn.chapter4.main.MyBatisMain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import org.apache.log4j.Logger;

@Service
public class RoleListServiceImpl implements RoleListService{

    @Autowired
    private RoleService roleService = null;
    Logger logger = Logger.getLogger(String.valueOf(RoleListServiceImpl.class));

    @Override
    @Transactional(propagation = Propagation.REQUIRED,
    isolation = Isolation.READ_COMMITTED)
    public int insertRoleList(List<Role> roleList) {
        int count = 0;
        for (Role role : roleList) {
            try {
                count += roleService.insertRole(role);
            } catch (Exception exception) {
                logger.info(String.valueOf(exception));
            }
        }
        // count代表几条数据被成功插入
        return count;
    }
}
