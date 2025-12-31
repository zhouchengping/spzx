package com.zcp.spzx.manager.mapper;

import com.zcp.spzx.model.dto.system.SysUserDto;
import com.zcp.spzx.model.entity.system.SysUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SysUserMapper {
    /**
     * 根据用户名查询用户数据
     * @param userName
     * @return
     */
    public abstract SysUser selectByUserName(String userName) ;


    public abstract List<SysUser> findByPage(SysUserDto sysUserDto);

    public abstract SysUser findByUserName(String userName);

    public abstract void saveSysUser(SysUser sysUser);
    public abstract void updateSysUser(SysUser sysUser);
    public abstract void deleteById(Long userId);
}