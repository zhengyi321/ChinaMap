package com.chinamap.modular.service.impl;

import com.chinamap.modular.entity.ReadAndGood;
import com.chinamap.modular.mapper.ReadAndGoodMapper;
import com.chinamap.modular.service.ReadAndGoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
@Transactional(isolation = Isolation.REPEATABLE_READ, propagation = Propagation.REQUIRED)
@Service
public class ReadAndGoodServiceImpl implements ReadAndGoodService {


    @Autowired
    private ReadAndGoodMapper readAndGoodMapper;
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    @Override
    public int deleteByPrimaryKey(Long id) {
        return readAndGoodMapper.deleteByPrimaryKey(id);
    }
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    @Override
    public int insert(ReadAndGood record) {
        return readAndGoodMapper.insert(record);
    }
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    @Override
    public int insertSelective(ReadAndGood record) {
        return readAndGoodMapper.insertSelective(record);
    }
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    @Override
    public ReadAndGood selectByPrimaryKey(Long id) {
        return readAndGoodMapper.selectByPrimaryKey(id);
    }
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    @Override
    public List<ReadAndGood> selectBytime(String time) {
        return readAndGoodMapper.selectBytime(time);
    }
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    @Override
    public int updateByPrimaryKeySelective(ReadAndGood record) {
        return readAndGoodMapper.updateByPrimaryKeySelective(record);
    }
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    @Override
    public int updateByPrimaryKey(ReadAndGood record) {
        return readAndGoodMapper.updateByPrimaryKey(record);
    }
}
