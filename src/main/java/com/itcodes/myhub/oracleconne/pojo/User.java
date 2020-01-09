package com.itcodes.myhub.oracleconne.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName User
 * @Author sussen
 * @Version 1.0
 * @Data 2020/1/9
 */
@Data
public class User implements Serializable {

    private static final long serialVersionUID = -1737120433863548275L;
    private String id;
    private String name;
    private String sex;
    private String age;
    private String status;
}
