package com.zcp.spzx.user.service;

import com.zcp.spzx.model.entity.user.UserAddress;

import java.util.List;

//业务接口
public interface UserAddressService {

    List<UserAddress> findUserAddressList();

    UserAddress getById(Long id);
}