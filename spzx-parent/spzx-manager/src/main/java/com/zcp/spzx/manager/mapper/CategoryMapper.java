package com.zcp.spzx.manager.mapper;

import com.zcp.spzx.model.entity.product.Category;
import com.zcp.spzx.model.vo.product.CategoryExcelVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CategoryMapper {
    public abstract List<Category> selectByParentId(Long parentId);
    public abstract int countByParentId(Long id);

    public abstract List<Category> selectAll();


    public abstract void batchInsert(List<CategoryExcelVo> categoryList);

}