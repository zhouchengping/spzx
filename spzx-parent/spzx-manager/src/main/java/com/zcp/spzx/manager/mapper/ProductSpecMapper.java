package com.zcp.spzx.manager.mapper;

import com.zcp.spzx.model.entity.product.ProductSpec;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductSpecMapper {
    public abstract List<ProductSpec> findByPage();
    public abstract void save(ProductSpec productSpec);
    public abstract void updateById(ProductSpec productSpec);
    public abstract void deleteById(Long id);
    public abstract List<ProductSpec> findAll();
}