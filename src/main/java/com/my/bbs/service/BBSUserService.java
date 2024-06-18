package com.my.bbs.service;

import com.my.bbs.entity.BBSUser;

import javax.servlet.http.HttpSession;
import java.util.List;

public interface BBSUserService {

    /**
     * 用户注册
     *
     * @param loginName
     * @param password
     * @return
     */
    String register(String loginName, String password, String nickName);

    /**
     * 登录
     *
     * @param loginName
     * @param passwordMD5
     * @param httpSession
     * @return
     */
    String login(String loginName, String passwordMD5, HttpSession httpSession);

    /**
     * 修改用户信息
     *
     * @param bbsUser
     * @param httpSession
     * @return
     */
    Boolean updateUserInfo(BBSUser bbsUser, HttpSession httpSession);

    /**
     * 修改用户头像
     *
     * @param bbsUser
     * @return
     */
    Boolean updateUserHeadImg(BBSUser bbsUser, HttpSession httpSession);

    /**
     * 获取用户详情
     *
     * @param userId
     * @return
     */
    BBSUser getUserById(Long userId);

    /**
     * 修改密码
     *
     * @param userId
     * @param originalPassword
     * @param newPassword
     * @return
     */
    Boolean updatePassword(Long userId, String originalPassword, String newPassword);
}
