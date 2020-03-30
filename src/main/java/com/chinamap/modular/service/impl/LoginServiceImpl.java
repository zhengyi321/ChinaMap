package com.chinamap.modular.service.impl;

import com.chinamap.modular.mapper.LoginMapper;
import com.chinamap.modular.entity.Login;
import com.chinamap.modular.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Transactional(isolation = Isolation.REPEATABLE_READ, propagation = Propagation.REQUIRED)
@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private LoginMapper loginMapper;
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    @Override
    public Login findUserByCodeAndPwd(String user_code, String user_pwd) {
        // 获取数据库用户信息
        Login logininfo = loginMapper.selectByAccountPass(user_code, user_pwd);
        return logininfo;
    }
}
