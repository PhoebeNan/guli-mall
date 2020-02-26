package com.zyn.mall.service.impl;


import com.zyn.mall.mapper.UmsMemberReceiveAddressMapper;
import com.zyn.mall.mapper.UserMapper;
import com.zyn.mall.service.UserService;
import com.zyn.mall.user.UmsMember;
import com.zyn.mall.user.UmsMemberReceiveAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;


/**
 * @author zhaoyanan
 * @create 2019-10-30-9:13
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;



    @Override
    public List<UmsMember> getAllUser() {

        List<UmsMember> umsMembers = userMapper.selectAll();
        return umsMembers;
    }

    @Override
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId) {

        Example example = new Example(UmsMemberReceiveAddress.class);
        example.createCriteria().andEqualTo("memberId", memberId);

        List<UmsMemberReceiveAddress> UmsMemberReceiveAddress =
                umsMemberReceiveAddressMapper.selectByExample(example);
        return UmsMemberReceiveAddress;
    }

    @Override
    public UmsMember login(UmsMember umsMember) {
        return null;
    }

    @Override
    public void addUserTokenToCache(String token, String userId) {

    }

    @Override
    public UmsMember addAuthUserToDb(UmsMember umsMember) {
        return null;
    }

    @Override
    public UmsMember checkAuthUser(UmsMember checkUser) {
        return null;
    }

    @Override
    public UmsMemberReceiveAddress getReceiveAddressById(String receiveAddressId) {
        return null;
    }

}
