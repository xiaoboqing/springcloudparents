package com.wang.mybatisplus.hander;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 元数据处理器
 */
@Slf4j
@Component
public class MyMateObjectHander implements MetaObjectHandler {
    // 插入时处理
    @Override
    public void insertFill(MetaObject metaObject) {
        log.info("添加数据");
        this.setFieldValByName("create_time", new Date(), metaObject);
    }

    // 更新时处理
    @Override
    public void updateFill(MetaObject metaObject) {
        log.info("更新数据");
        this.setFieldValByName("update_time", new Date(), metaObject);

    }
}
