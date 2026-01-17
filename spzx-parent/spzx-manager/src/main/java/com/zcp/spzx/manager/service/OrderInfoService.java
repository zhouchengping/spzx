package com.zcp.spzx.manager.service;

import com.zcp.spzx.model.dto.order.OrderStatisticsDto;
import com.zcp.spzx.model.vo.order.OrderStatisticsVo;

public interface OrderInfoService {
    OrderStatisticsVo getOrderStatisticsData(OrderStatisticsDto orderStatisticsDto);
}
