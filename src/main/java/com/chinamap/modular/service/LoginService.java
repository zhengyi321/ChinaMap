package com.chinamap.modular.service;

import com.chinamap.modular.entity.Login;

public interface LoginService {
    /**
     *
     * @Title: findUserByCodeAndPwd
     * @Description: 根据账号和密码查找用户
     * @param user_code 账号
     * @param user_pwd 密码
     * @return
     */
    public Login findUserByCodeAndPwd(String user_code, String user_pwd);
}
