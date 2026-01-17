package com.zcp.spzx.cart.service;

import com.zcp.spzx.model.entity.h5.CartInfo;

import java.util.List;

public interface CartService {
    void addToCart(Long skuId, Integer skuNum);
    //业务接口
    List<CartInfo> getCartList();
    //业务接口
    void deleteCart(Long skuId);
    //业务接口
    void checkCart(Long skuId, Integer isChecked);
    //业务接口
    void allCheckCart(Integer isChecked);
    //业务接口
    void clearCart();

    List<CartInfo> getAllCkecked();

    void deleteChecked();
}