package com.example.demo5_mybatis.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MybatisPlusConfig {
    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor(){
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        NewPaginationInnerInterceptor newPaginationInnerInterceptor = new NewPaginationInnerInterceptor(DbType.MYSQL);

        // 设置了分页插件的 overflow 属性为 true，以便在分页查询超出最大页码时显示第一页。
        newPaginationInnerInterceptor.setOverflow(true);
        interceptor.addInnerInterceptor(newPaginationInnerInterceptor);
        return interceptor;
    }
}
