package com.zcp.spzx.product.mapper;

import com.zcp.spzx.model.entity.product.Product;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProductMapper {

    Product getById(Long id);
}