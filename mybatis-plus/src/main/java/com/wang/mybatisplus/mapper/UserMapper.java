package com.wang.mybatisplus.mapper;

import com.wang.mybatisplus.beans.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author mybatis-plus-demo
 * @since 2020-11-24
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
