package com.zcp.spzx.user.service;

import com.zcp.spzx.model.dto.h5.UserLoginDto;
import com.zcp.spzx.model.dto.h5.UserRegisterDto;
import com.zcp.spzx.model.vo.h5.UserInfoVo;

public interface UserInfoService {
    void register(UserRegisterDto userRegisterDto);

    //业务接口
    String login(UserLoginDto userLoginDto);

    UserInfoVo getCurrentUserInfo(String token);
}