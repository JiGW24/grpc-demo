package com.jgw.mapper;

import com.jgw.pojo.TOrder;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.Mapper;

/**
 * @author Willis JiGW
 * @version v1.0.0
 * @date Created on 4:42 下午 2021/2/26
 * @desc
 */
@Component
public interface TOrderMapper extends Mapper<TOrder> {

    @Select(" select max(id) from t_order where order_id =  12 and deleted = 0")
    Integer selectMaxId();


}
