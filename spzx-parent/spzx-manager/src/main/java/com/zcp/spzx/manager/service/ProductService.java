package com.zcp.spzx.manager.service;

import com.github.pagehelper.PageInfo;
import com.zcp.spzx.model.dto.product.ProductDto;
import com.zcp.spzx.model.entity.product.Product;
import org.springframework.transaction.annotation.Transactional;

public interface ProductService {
    PageInfo<Product> findByPage(Integer page, Integer limit, ProductDto productDto);

    void save(Product product);

    Product getById(Long id);

    void updateById(Product product);

    @Transactional
    void deleteById(Long id);

    void updateAuditStatus(Long id, Integer auditStatus);

    void updateStatus(Long id, Integer status);
}
