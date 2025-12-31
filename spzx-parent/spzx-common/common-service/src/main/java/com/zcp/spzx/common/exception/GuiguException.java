package com.zcp.spzx.common.exception;

import com.zcp.spzx.model.vo.common.ResultCodeEnum;
import lombok.Data;

@Data
public class GuiguException extends RuntimeException{

    private Integer code;
    private String message;
    private ResultCodeEnum resultCodeEnum;

    public GuiguException(ResultCodeEnum resultCodeEnum) {
        this.resultCodeEnum = resultCodeEnum;
        this.code = resultCodeEnum.getCode();
        this.message = resultCodeEnum.getMessage();
    }
}
