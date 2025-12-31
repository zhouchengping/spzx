package com.zcp.spzx.manager.mapper;

import com.zcp.spzx.model.entity.system.SysMenu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

// com.atguigu.spzx.manager.mapper
@Mapper
public interface SysMenuMapper {
    public abstract List<SysMenu> selectAll();

    public abstract void insert(SysMenu sysMenu);

    public abstract void updateById(SysMenu sysMenu);

    public abstract int countByParentId(Long id);
    public abstract void deleteById(Long id);

    public abstract List<SysMenu> selectListByUserId(Long userId);

    public abstract SysMenu selectById(Long parentId);
}