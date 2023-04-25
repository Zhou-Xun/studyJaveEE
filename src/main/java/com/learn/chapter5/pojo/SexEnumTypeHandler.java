package com.learn.chapter5.pojo;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.*;

@MappedJdbcTypes({JdbcType.CHAR,JdbcType.VARCHAR})
@MappedTypes(SexEnum.class)
public class SexEnumTypeHandler extends BaseTypeHandler<SexEnum> {

    /**
     * 参数设置
     * @param ps Statement
     * @param i 参数位置
     * @param parameter 参数
     * @param jdbcType jdbc类型
     * @throws SQLException
     */
    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, SexEnum parameter, JdbcType jdbcType) throws SQLException {
        Integer SexEnum = parameter.getId();
        ps.setString(i,SexEnum.toString());
    }

    /**
     * 返回值处理
     * @param rs ResultSet结果集
     * @param columnName 当前列名
     * @return SexEnum
     * @throws SQLException
     */
    @Override
    public SexEnum getNullableResult(ResultSet rs, String columnName) throws SQLException {
        Integer id = Integer.valueOf(rs.getString(columnName));
        return SexEnum.getSexById(id);
    }

    /**
     * 返回值处理
     * @param rs 结果集
     * @param columnIndex 当前需要转为的列的位置
     * @return SexEnum
     * @throws SQLException
     */
    @Override
    public SexEnum getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        Integer id = Integer.valueOf(rs.getInt(columnIndex));
        return SexEnum.getSexById(id);
    }

    /**
     * 存储过程结果处理
     * @param cs
     * @param columnIndex 列的位置
     * @return 映射到属性上的值
     * @throws SQLException
     */
    @Override
    public SexEnum getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        Integer id = Integer.valueOf(cs.getInt(columnIndex));
        return SexEnum.getSexById(id);
    }
}