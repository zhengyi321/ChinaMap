package com.chinamap.modular.service.impl;

import com.chinamap.modular.entity.Pay;
import com.chinamap.modular.mapper.PayMapper;
import com.chinamap.modular.service.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(isolation = Isolation.REPEATABLE_READ, propagation = Propagation.REQUIRED)
@Service
public class PayServiceImpl implements PayService {
    @Autowired
    private PayMapper payMapper;
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    @Override
    public List<Pay> selectPayList() {
        List<Pay> payList = payMapper.selectPayList();
        return payList;
    }
}
