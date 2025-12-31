package com.zcp.spzx.manager.mapper;

import com.zcp.spzx.model.dto.product.CategoryBrandDto;
import com.zcp.spzx.model.entity.product.Brand;
import com.zcp.spzx.model.entity.product.CategoryBrand;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CategoryBrandMapper {
    public abstract List<CategoryBrand> findByPage(CategoryBrandDto CategoryBrandDto);
    public abstract void save(CategoryBrand categoryBrand);

    public abstract void updateById(CategoryBrand categoryBrand);
    public abstract void deleteById(Long id);

    List<Brand> findBrandByCategoryId(Long categoryId);
}