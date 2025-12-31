package com.zcp.spzx.manager.mapper;

import com.zcp.spzx.model.entity.base.ProductUnit;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductUnitMapper {
    public abstract List<ProductUnit> findAll();
}