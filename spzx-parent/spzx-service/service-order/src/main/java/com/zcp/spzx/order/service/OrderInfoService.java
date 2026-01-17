package com.zcp.spzx.order.service;

import com.github.pagehelper.PageInfo;
import com.zcp.spzx.model.dto.h5.OrderInfoDto;
import com.zcp.spzx.model.entity.order.OrderInfo;
import com.zcp.spzx.model.vo.h5.TradeVo;

//业务接口
public interface OrderInfoService {
    TradeVo getTrade();

    Long submitOrder(OrderInfoDto orderInfoDto);

    OrderInfo getOrderInfo(Long orderId);

    TradeVo buy(Long skuId);

    PageInfo<OrderInfo> findUserPage(Integer page, Integer limit, Integer orderStatus);
    // 业务接口
    OrderInfo getByOrderNo(String orderNo) ;

    void updateOrderStatus(String orderNo, Integer orderStatus);
}