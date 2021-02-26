package com.jgw.pojo;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author Willis JiGW
 * @version v1.0.0
 * @date Created on 4:28 下午 2021/2/26
 * @desc
 */
@Data
@Table(name = "t_order")
public class TOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private Integer age;

    private Date createTime;

    private Date updateTime;

    private Integer deleted;


    private Integer userId;

    private Integer orderId;
}
