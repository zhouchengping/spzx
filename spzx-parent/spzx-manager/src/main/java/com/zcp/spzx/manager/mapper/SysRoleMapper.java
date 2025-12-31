package com.zcp.spzx.manager.mapper;

import com.zcp.spzx.model.dto.system.SysRoleDto;
import com.zcp.spzx.model.entity.system.SysRole;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SysRoleMapper {
    public abstract List<SysRole> findByPage(SysRoleDto sysRoleDto);
    public abstract void saveSysRole(SysRole sysRole);
    public abstract void updateSysRole(SysRole sysRole);
    public abstract void deleteById(Long roleId);

    public abstract List<SysRole> findAllRoles();
}