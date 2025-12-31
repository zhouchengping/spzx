package com.zcp.spzx.manager.service;

import com.zcp.spzx.model.dto.system.AssginMenuDto;

import java.util.Map;

public interface SysRoleMenuService {
    public abstract Map<String, Object> findSysRoleMenuByRoleId(Long roleId);

    public abstract void doAssign(AssginMenuDto assginMenuDto);
}
