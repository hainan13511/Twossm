package com;

import lombok.Data;

import java.io.Serializable;

/**
 * @author : YangHaiNan
 * @version : 1.0
 * @program: Twossm
 * @description: 测试实体类
 * DevelopTools : IntelliJ IDEA 2019.1.1
 * DevelopSystem : windows 10
 * Company : org.yhn
 * @create: 2020-01-22 16:58
 */

@Data
 public class Account implements Serializable {
    private static final long serialVersionUID = 6878327381231821149L;
    private Integer id;
    private String name;
    private Double money;
}
