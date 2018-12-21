package com.himalayan.common;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;

public class MybatisPlusConfig {
    /**
     * mybatis-plus分页插件
     */
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor page = new PaginationInterceptor();
        page.setDialectType("mysql");
        return page;
    }
}
