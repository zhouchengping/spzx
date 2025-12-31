package com.zcp.spzx.manager.service;

import com.github.pagehelper.PageInfo;
import com.zcp.spzx.model.dto.system.AssginRoleDto;
import com.zcp.spzx.model.dto.system.LoginDto;
import com.zcp.spzx.model.dto.system.SysUserDto;
import com.zcp.spzx.model.entity.system.SysUser;
import com.zcp.spzx.model.vo.system.LoginVo;
import org.springframework.transaction.annotation.Transactional;

public interface SysUserService {
    /**
     * 根据用户名查询用户数据
     * @return
     */
    public abstract LoginVo login(LoginDto loginDto) ;
    public abstract SysUser getUserInfo(String token) ;
    public abstract void logout(String token)  ;

    public abstract PageInfo<SysUser> findByPage(SysUserDto sysUserDto, Integer pageNum, Integer pageSize);

    public abstract void saveSysUser(SysUser sysUser);

    public abstract void updateSysUser(SysUser sysUser);

    public abstract void deleteById(Long userId);

    @Transactional
    void doAssign(AssginRoleDto assginRoleDto);
}
