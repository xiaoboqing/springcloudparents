package com.wang.mybatisplus;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wang.mybatisplus.beans.User;
import com.wang.mybatisplus.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

import java.util.List;

@SpringBootTest
class MybatisPlusApplicationTests {

    @Autowired
    private UserMapper userMapper;

    /**
     * 获取所有用户信息
     */
    @Test
    public void findAllUser() {

        List<User> userList = userMapper.selectList(null);

        userList.forEach(System.out::println);
    }

    /**
     * 添加用户
     */
    @Test
    public void insertUser() {
        User user = new User();
        user.setName("你好2");
        user.setAge(18);

        int userId = userMapper.insert(user);

        System.out.println(user);
    }

    /**
     * 更新数据
     */
    @Test
    public void updateUser() {
        User user = new User();
        user.setId(7);
        user.setAge(18);

        userMapper.updateById(user);
    }

    /**
     * 乐观锁测试
     * 1.查询用户信息
     * 2.更新用户信息
     */
    @Test
    public void optimisticLockerTest() {

        User user = userMapper.selectById(7);

        user.setName("你好");

        userMapper.updateById(user);

    }

    /**
     * 分页插件
     */
    @Test
    public void paginationTest() {

        // 创建分页对象
        Page page = new Page(2, 2);

        userMapper.selectPage(page, null);

        // 获取查询记录
        page.getRecords().forEach(System.out::println);

        // 获取总记录数
        System.out.println(page.getTotal());

        // 当前页
        System.out.println(page.getCurrent());
    }

    /**
     * 逻辑删除
     */
    @Test
    public void tableLogicDelete() {
        userMapper.deleteById(5);
    }
}
