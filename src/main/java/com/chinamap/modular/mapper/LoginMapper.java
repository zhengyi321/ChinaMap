package com.chinamap.modular.mapper;

import com.chinamap.modular.entity.Login;
import org.apache.ibatis.annotations.Param;

public interface LoginMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Login record);

    int insertSelective(Login record);

    Login selectByPrimaryKey(Integer id);

    Login selectByAccountPass(@Param("account") String user_code,@Param("pass") String user_pwd);

    int updateByPrimaryKeySelective(Login record);

    int updateByPrimaryKey(Login record);
}