package com.b1ackc4t.marsctfserver.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.Date;

@Data
public class WpComment {
    private Integer wid;
    private Integer uid;
    @TableId(type = IdType.AUTO)
    private Integer wcid;
    private String text;
    private Date createTime;

    private String uname;
}
