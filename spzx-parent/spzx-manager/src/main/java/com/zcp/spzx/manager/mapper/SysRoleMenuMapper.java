package com.zcp.spzx.manager.mapper;

import com.zcp.spzx.model.dto.system.AssginMenuDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SysRoleMenuMapper {
    public abstract List<Long> findSysRoleMenuByRoleId(Long roleId);

    public abstract void deleteByRoleId(Long roleId);

    public abstract void doAssign(AssginMenuDto assginMenuDto);

    public abstract void updateSysRoleMenuIsHalf(Long id);
}