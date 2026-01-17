package com.zcp.spzx.pay.service;

import com.zcp.spzx.model.entity.pay.PaymentInfo;

import java.util.Map;

//业务接口
public interface PaymentInfoService {
    PaymentInfo savePaymentInfo(String orderNo);

    //业务接口
    void updatePaymentStatus(Map<String, String> map, Integer payType);
}