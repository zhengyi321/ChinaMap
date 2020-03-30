package com.chinamap.modular.mapper;

import com.chinamap.modular.entity.Pay;

import java.util.List;

public interface PayMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Pay record);

    int insertSelective(Pay record);

    Pay selectByPrimaryKey(Integer id);

    List<Pay> selectPayList();

    int updateByPrimaryKeySelective(Pay record);

    int updateByPrimaryKey(Pay record);
}