package com.zyn.mall.mapper;


import com.zyn.mall.user.UmsMember;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @author zhaoyanan
 * @create 2019-10-30-9:15
 */
public interface UserMapper extends Mapper<UmsMember> {

    List<UmsMember> selectAllUser();

}
