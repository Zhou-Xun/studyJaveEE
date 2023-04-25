package com.learn.chapter4.dao;

import com.learn.chapter4.pojo.PageParams;
import com.learn.chapter4.pojo.Role;
import com.learn.chapter4.pojo.RoleParams;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;
import java.util.Map;

public interface RoleDao {

    public int insertRole(Role role);

    public int deleteRole(Long id);

    public int updateRole(Role role);

    public Role getRole(Long id);

    public List<Role> getRoleByList(@Param("roleIdList") List roleIdList);

    public List<Role> findRoles(String roleName);

    public List<Role> findRoles2(@Param("roleName") String roleName, @Param("note") String note);

    public List<Role> findRolesBind(@Param("roleName") String roleName, @Param("note") String note);

    public Integer countByNote(String note);

    public List<Role> findRolesByMap(Map<String, Object> parameterMap);

    public List<Role> findRolesByAnnotation(@Param("roleName") String roleName, @Param("note") String note);

    public List<Role> findRolesByBean(RoleParams roleParams);

    public List<Role> findByMix(@Param("params") RoleParams roleParams, @Param("page") PageParams pageParams);

    public List<Role> findByRowBounds(@Param("roleName") String roleName, @Param("note") String note, RowBounds rowBounds);
}
