package com.zcp.spzx.product.service;

import com.github.pagehelper.PageInfo;
import com.zcp.spzx.model.dto.h5.ProductSkuDto;
import com.zcp.spzx.model.entity.product.ProductSku;
import com.zcp.spzx.model.vo.h5.ProductItemVo;
import com.zcp.spzx.model.dto.product.SkuSaleDto;

import java.util.List;

// 业务接口
public interface ProductService {

    List<ProductSku> findProductSkuBySale();

    PageInfo<ProductSku> findByPage(Integer page, Integer limit, ProductSkuDto productSkuDto);

    ProductItemVo item(Long skuId);

    ProductSku getBySkuId(Long skuId);

    //业务接口
    Boolean updateSkuSaleNum(List<SkuSaleDto> skuSaleDtoList);
}