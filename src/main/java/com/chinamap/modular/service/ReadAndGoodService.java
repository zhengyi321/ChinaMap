package com.chinamap.modular.service;

import com.chinamap.modular.entity.ReadAndGood;

import java.util.Date;
import java.util.List;

public interface ReadAndGoodService {
    int deleteByPrimaryKey(Long id);

    int insert(ReadAndGood record);

    int insertSelective(ReadAndGood record);

    ReadAndGood selectByPrimaryKey(Long id);

    List<ReadAndGood> selectBytime(String time);

    int updateByPrimaryKeySelective(ReadAndGood record);

    int updateByPrimaryKey(ReadAndGood record);
}
