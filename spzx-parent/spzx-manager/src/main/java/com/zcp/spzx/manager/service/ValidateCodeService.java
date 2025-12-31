package com.zcp.spzx.manager.service;

import com.zcp.spzx.model.vo.system.ValidateCodeVo;

public interface ValidateCodeService {
    // 获取验证码图片
    public abstract ValidateCodeVo generateValidateCode();
}
