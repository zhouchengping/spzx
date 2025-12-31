package com.zcp.spzx.manager.mapper;

import com.zcp.spzx.model.dto.product.ProductDto;
import com.zcp.spzx.model.entity.product.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper {
    public abstract List<Product> findByPage(ProductDto productDto);
    public abstract void save(Product product);
    public abstract Product selectById(Long id);
    public abstract  void updateById(Product product);

    public abstract void deleteById(Long id);
}