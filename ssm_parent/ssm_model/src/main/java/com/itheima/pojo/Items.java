package com.itheima.pojo;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**
 * @author 周盼龙
 * @date 2020/2/23 20:29
 */
@Data
@ToString
public class Items {
    private Integer id;
    private String name;
    private Float price;
    private String pic;
    private Date createtime;
    private String detail;


}
