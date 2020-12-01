package com.wang.mybatisplus.service.impl;

import com.wang.mybatisplus.beans.User;
import com.wang.mybatisplus.mapper.UserMapper;
import com.wang.mybatisplus.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author mybatis-plus-demo
 * @since 2020-11-24
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
