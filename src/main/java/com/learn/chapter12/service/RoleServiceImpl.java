package com.learn.chapter12.service;

import com.learn.chapter12.mapper.RoleMapper;
import com.learn.chapter12.pojo.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RoleServiceImpl implements RoleService{

    @Autowired
    private RoleMapper roleMapper = null;

    @Transactional(propagation = Propagation.REQUIRES_NEW,
    isolation = Isolation.READ_COMMITTED)
    @Override
    public int insertRole(Role role) {
        return roleMapper.insertRole(role);
    }
}
