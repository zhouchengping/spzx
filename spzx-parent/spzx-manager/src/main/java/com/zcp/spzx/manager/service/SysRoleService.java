package com.zcp.spzx.manager.service;

import com.github.pagehelper.PageInfo;
import com.zcp.spzx.model.dto.system.SysRoleDto;
import com.zcp.spzx.model.entity.system.SysRole;

import java.util.Map;

// 业务接口
public interface SysRoleService {
    public abstract PageInfo<SysRole> findByPage(SysRoleDto sysRoleDto, Integer pageNum, Integer pageSize);

    public abstract void saveSysRole(SysRole sysRole);

    public abstract void updateSysRole(SysRole sysRole);

    public abstract void deleteById(Long roleId);

    public abstract Map<String, Object> findAllRoles();

    public abstract Map<String, Object> findAllRoles(Long userId);
}