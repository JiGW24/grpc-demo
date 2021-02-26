package com.jgw.mapper;

import com.jgw.pojo.Nb;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.Mapper;

/**
 * @author Willis JiGW
 * @version v1.0.0
 * @date Created on 5:29 下午 2021/2/23
 * @desc
 */
@Component
public interface NbMapper extends Mapper<Nb> {

    @Select(" select count(*) from nb where deleted = 0")
    Integer countSum();
}
