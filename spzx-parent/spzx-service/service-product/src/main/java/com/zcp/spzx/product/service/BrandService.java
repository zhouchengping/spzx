package com.zcp.spzx.product.service;

import com.zcp.spzx.model.entity.product.Brand;

import java.util.List;

// 业务接口
public interface BrandService {

    List<Brand> findAll();

}