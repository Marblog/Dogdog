package com.me.dogdog.config

import com.baomidou.mybatisplus.annotation.DbType
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor
import org.mybatis.spring.annotation.MapperScan
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
@MapperScan("com.me.dogdog.mapper")
class MybatisPlusConfig {

    @Bean
    fun mybatisPlusInterceptor(): MybatisPlusInterceptor? {
        val interceptor: MybatisPlusInterceptor? = null
        interceptor?.addInnerInterceptor(PaginationInnerInterceptor(DbType.DB2))
        return interceptor
    }
}