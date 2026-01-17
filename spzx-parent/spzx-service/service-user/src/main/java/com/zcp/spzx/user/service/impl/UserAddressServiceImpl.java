package com.zcp.spzx.user.service.impl;

import com.zcp.spzx.model.entity.user.UserAddress;
import com.zcp.spzx.user.mapper.UserAddressMapper;
import com.zcp.spzx.user.service.UserAddressService;
import com.zcp.spzx.utils.AuthContextUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//业务接口实现
@Service
@SuppressWarnings({"unchecked", "rawtypes"})
public class UserAddressServiceImpl implements UserAddressService {

   @Autowired
   private UserAddressMapper userAddressMapper;

   @Override
   public List<UserAddress> findUserAddressList() {
      Long userId = AuthContextUtil.getUserInfo().getId();
      return userAddressMapper.findByUserId(userId);
   }

   //业务接口实现
   @Override
   public UserAddress getById(Long id) {
      return userAddressMapper.getById(id);
   }
}