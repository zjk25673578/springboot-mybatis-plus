package com.himalayan.util;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

/**
 * <p>
 * 代码生成器演示
 * </p>
 */
public class MpGenerator {

    public static void main(String[] args) {
//        assert (false) : "代码生成属于危险操作，请确定配置后取消断言执行代码生成！";
        AutoGenerator mpg = new AutoGenerator();
        // 选择 freemarker 引擎，默认 Velocity
        // 这里设置模板是使用哪种模板生成xml和java(牛逼...)
        mpg.setTemplateEngine(new FreemarkerTemplateEngine());

        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        gc.setAuthor("zjk");
        gc.setOutputDir("src\\main\\java");
        gc.setFileOverride(true);// 是否覆盖同名文件，默认是false
        gc.setActiveRecord(false);// 不需要ActiveRecord特性的请改为false, 每个实体类中包含各自的CRUD的方法
        gc.setEnableCache(false);// XML 二级缓存
        gc.setBaseResultMap(false);// XML ResultMap
        gc.setBaseColumnList(false);// XML columList
        /* 自定义文件命名，注意 %s 会自动填充表实体属性！ */
        gc.setMapperName("%sMapper");
        gc.setXmlName("%sMapper");
        gc.setServiceName("%sService");
        gc.setServiceImplName("%sServiceImpl");
        gc.setControllerName("%sController");
        mpg.setGlobalConfig(gc);

        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDbType(DbType.MYSQL);
/*        dsc.setTypeConvert(new MySqlTypeConvert() {
            // 自定义数据库表字段类型转换【可选】
            @Override
            public DbColumnType processTypeConvert(String fieldType) {
                // 注意！！processTypeConvert 存在默认类型转换，如果不是你要的效果请自定义返回、非如下直接返回。
                return super.processTypeConvert(fieldType);
            }
        });*/
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("123456");
        dsc.setUrl("jdbc:mysql://localhost:3306/myhome?useUnicode=true&characterEncoding=utf8");
        mpg.setDataSource(dsc);

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        strategy.setCapitalMode(false);// 全局大写命名 ORACLE 注意
        strategy.setTablePrefix("mh");// 此处可以修改为您的表前缀(需要忽略的前缀)
        strategy.setNaming(NamingStrategy.underline_to_camel);// 表名生成策略
        // strategy.setInclude("mh_users"); // 需要生成的表
        // strategy.setExclude("test"); // 排除生成的表
        /*=======================如果这个设置了这个属性, setActiveRecord(false)最好改为false==================*/
        /*======================或者让ModelParent这个类集成MybatisPlus里的Model==================*/
        // 自定义实体父类
        strategy.setSuperEntityClass("com.himalayan.util.ModelParent");
        // 自定义实体，公共字段
        strategy.setSuperEntityColumns("ids", "createtime", "creator", "createname", "updatetime", "updator", "updatename");
        /*=====================================================================*/
        // 自定义 mapper 父类
        // strategy.setSuperMapperClass("com.baomidou.demo.TestMapper");
        // 自定义 service 父类
        // strategy.setSuperServiceClass("com.baomidou.demo.TestService");
        // 自定义 service 实现类父类
        // strategy.setSuperServiceImplClass("com.baomidou.demo.TestServiceImpl");
        // 自定义 controller 父类
        // strategy.setSuperControllerClass("com.baomidou.demo.TestController");
        // 【实体】是否生成字段常量（默认 false）
        // public static final String ID = "test_id";
        // strategy.setEntityColumnConstant(true);
        // 【实体】是否为构建者模型（默认 false）
        // public User setName(String name) {this.name = name; return this;}
        // strategy.setEntityBuilderModel(true);
        mpg.setStrategy(strategy);

        // 包配置
        PackageConfig pc = new PackageConfig();
        pc.setParent("com.himalayan.work");
        // pc.setModuleName("mh_users");
        pc.setController("controller");
        pc.setEntity("model");
        pc.setMapper("dao");
        pc.setXml("dao.mapper");
        pc.setServiceImpl("service.impl");
        mpg.setPackageInfo(pc);

        // 注入自定义配置，可以在 VM 中使用 cfg.abc 【可无】
        // InjectionConfig cfg = new InjectionConfig() {
        // @Override
        // public void initMap() {
        // Map<String, Object> map = new HashMap<String, Object>();
        // map.put("abc", this.getConfig().getGlobalConfig().getAuthor() +
        // "-mp");
        // this.setMap(map);
        // }
        // };
        //
        // // 自定义 xxList.jsp 生成
        // List<FileOutConfig> focList = new ArrayList<>();
        // focList.add(new FileOutConfig("/template/list.jsp.vm") {
        // @Override
        // public String outputFile(TableInfo tableInfo) {
        // // 自定义输入文件名称
        // return "D://my_" + tableInfo.getEntityName() + ".jsp";
        // }
        // });
        // cfg.setFileOutConfigList(focList);
        // mpg.setCfg(cfg);
        //
        // // 调整 xml 生成目录演示
        // focList.add(new FileOutConfig("/templates/mapper.xml.vm") {
        // @Override
        // public String outputFile(TableInfo tableInfo) {
        // return "/develop/code/xml/" + tableInfo.getEntityName() + ".xml";
        // }
        // });
        // cfg.setFileOutConfigList(focList);
        // mpg.setCfg(cfg);
        //
        // // 关闭默认 xml 生成，调整生成 至 根目录
        // TemplateConfig tc = new TemplateConfig();
        // tc.setXml(null);
        // mpg.setTemplate(tc);

        // 自定义模板配置，可以 copy 源码 mybatis-plus/src/main/resources/templates 下面内容修改，
        // 放置自己项目的 src/main/resources/templates 目录下, 默认名称一下可以不配置，也可以自定义模板名称
        // TemplateConfig tc = new TemplateConfig();
        // tc.setController("...");
        // tc.setEntity("...");
        // tc.setMapper("...");
        // tc.setXml("...");
        // tc.setService("...");
        // tc.setServiceImpl("...");
        // 如上任何一个模块如果设置 空 OR Null 将不生成该模块。
        // mpg.setTemplate(tc);

        // 执行生成
        mpg.execute();

        // 打印注入设置【可无】
        // System.err.println(mpg.getCfg().getMap().get("abc"));
    }
}
