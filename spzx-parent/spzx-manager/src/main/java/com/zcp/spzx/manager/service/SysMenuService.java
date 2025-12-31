package com.zcp.spzx.manager.service;

import com.zcp.spzx.model.entity.system.SysMenu;
import com.zcp.spzx.model.vo.system.SysMenuVo;

import java.util.List;

public interface SysMenuService {
    public abstract List<SysMenu> findNodes();

    public abstract void save(SysMenu sysMenu);

    public abstract void updateById(SysMenu sysMenu);

    public abstract void removeById(Long id);

    List<SysMenuVo> findUserMenuList();
}
