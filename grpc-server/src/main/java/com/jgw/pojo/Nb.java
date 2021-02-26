package com.jgw.pojo;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * @author Willis JiGW
 * @version v1.0.0
 * @date Created on 5:19 下午 2021/2/23
 * @desc
 */
@Table(name = "nb")
@Data
public class Nb implements Serializable {


    private static final long serialVersionUID = 2544319473243857722L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private Integer age;

    private Date createTime;

    private Date updateTime;

    private Integer deleted;

}
