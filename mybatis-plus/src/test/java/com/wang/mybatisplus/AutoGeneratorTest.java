package com.wang.mybatisplus;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.po.TableFill;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * 代码生成器
 */
public class AutoGeneratorTest {

    public static void main(String[] args) {

        // 创建代码生成器对象
        AutoGenerator mpg = new AutoGenerator();

        // 创建全局配置对象 F:\MyFile\QQ\springcloudparents\mybatis-plus\src
        GlobalConfig gc = new GlobalConfig();
        gc.setAuthor("JAVA小萌新");
        String projectPath = System.getProperty("user.dir");
        gc.setOutputDir("F:/MyFile/QQ/springcloudparents/mybatis-plus/src/main/java");
        gc.setAuthor("mybatis-plus-demo");
        gc.setEnableCache(false);// XML 二级缓存
        gc.setBaseResultMap(true);// XML ResultMap
        gc.setBaseColumnList(false)
                .setIdType(IdType.AUTO)
                .setFileOverride(true)
                .setDateType(DateType.ONLY_DATE)
                .setOpen(false);
        // gc.setSwagger2(true); 实体属性 Swagger2 注解serverTimezone=UTC
        mpg.setGlobalConfig(gc);

        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl("jdbc:mysql://localhost:3306/mybatis-plus?useSSL=false&useUnicode=true&characterEncoding=utf-8&serverTimezone=UTC");
        // dsc.setSchemaName("public");
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("root");
        mpg.setDataSource(dsc);

        // 包配置
        PackageConfig pc = new PackageConfig();
        pc.setParent("com.wang.mybatisplus")
                .setController("controller")
                .setEntity("beans")
                .setService("service")
                .setMapper("mapper")
                .setXml("mapper");
        mpg.setPackageInfo(pc);

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        strategy.setCapitalMode(true);// 全局大写命名 ORACLE 注意
        strategy.setVersionFieldName("version");  //乐观锁
        strategy.setLogicDeleteFieldName("deleted");
        strategy.setControllerMappingHyphenStyle(true);
        strategy.setEntityLombokModel(true);
        TableFill tableFill = new TableFill("create_time", FieldFill.INSERT);
        TableFill tableFill2 = new TableFill("update_time", FieldFill.UPDATE);
        List<TableFill> list = new ArrayList<>();
        list.add(tableFill);
        list.add(tableFill2);
        strategy.setTableFillList(list);
        //strategy.setTablePrefix(new String[] { "user_" });// 此处可以修改为您的表前缀
        strategy.setNaming(NamingStrategy.no_change);// 表名生成策略
        strategy.setInclude(new String[] { "user" }); // 需要生成的表
        // strategy.setExclude(new String[]{"test"}); // 排除生成的表
        mpg.setStrategy(strategy);

        mpg.execute();

    }
}
