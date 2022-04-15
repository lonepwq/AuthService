package com.pwq.model.vo;

import com.pwq.model.dto.UserDto;
import lombok.Data;

@Data
public class UserVo extends UserDto {
    /**
     * 主键id，自增
     */
    private Integer id;
}
