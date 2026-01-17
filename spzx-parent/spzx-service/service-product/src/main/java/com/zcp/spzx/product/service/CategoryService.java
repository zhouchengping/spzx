package com.zcp.spzx.product.service;

import com.zcp.spzx.model.entity.product.Category;

import java.util.List;

// 业务接口
public interface CategoryService {

    List<Category> findOneCategory();

    List<Category> findCategoryTree();
}