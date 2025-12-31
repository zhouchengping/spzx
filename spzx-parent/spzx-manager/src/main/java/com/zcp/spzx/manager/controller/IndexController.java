package com.zcp.spzx.manager.controller;

import com.zcp.spzx.manager.service.SysMenuService;
import com.zcp.spzx.manager.service.SysUserService;
import com.zcp.spzx.manager.service.ValidateCodeService;
import com.zcp.spzx.model.dto.system.LoginDto;
import com.zcp.spzx.model.entity.system.SysUser;
import com.zcp.spzx.model.vo.common.Result;
import com.zcp.spzx.model.vo.common.ResultCodeEnum;
import com.zcp.spzx.model.vo.system.LoginVo;
import com.zcp.spzx.model.vo.system.SysMenuVo;
import com.zcp.spzx.model.vo.system.ValidateCodeVo;
import com.zcp.spzx.utils.AuthContextUtil;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name ="用户接口")
@RestController
@RequestMapping(value="/admin/system/index")
public class IndexController {
    @Autowired
    private SysUserService sysUserService;

    @Operation(summary = "登录接口")
    @PostMapping(value = "/login")
    public Result<LoginVo> login(@RequestBody LoginDto loginDto){
        LoginVo loginVo = sysUserService.login(loginDto) ;
        return Result.build(loginVo , ResultCodeEnum.SUCCESS) ;
    }


    @Autowired
    private ValidateCodeService validateCodeService;

    @GetMapping(value = "/generateValidateCode")
    public Result<ValidateCodeVo> generateValidateCode() {
        ValidateCodeVo validateCodeVo = validateCodeService.generateValidateCode();
        return Result.build(validateCodeVo , ResultCodeEnum.SUCCESS) ;
    }

    @GetMapping(value = "/getUserInfo")
    public Result<SysUser> getUserInfo() {
        return Result.build(AuthContextUtil.get(), ResultCodeEnum.SUCCESS);
    }
//    public Result<SysUser> getUserInfo(@RequestHeader(name = "token") String token) {
//        SysUser sysUser = sysUserService.getUserInfo(token) ;
//        return Result.build(sysUser , ResultCodeEnum.SUCCESS) ;
//    }

    @GetMapping(value = "/logout")
    public Result logout(@RequestHeader(value = "token") String token) {
        sysUserService.logout(token) ;
        return Result.build(null , ResultCodeEnum.SUCCESS) ;
    }

    @Autowired
    private SysMenuService sysMenuService;
    @GetMapping("/menus")
    public Result menus() {
        List<SysMenuVo> sysMenuVoList =  sysMenuService.findUserMenuList() ;
        return Result.build(sysMenuVoList , ResultCodeEnum.SUCCESS) ;
    }

}
