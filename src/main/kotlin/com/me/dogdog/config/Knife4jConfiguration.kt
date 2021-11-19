package com.me.dogdog.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import springfox.documentation.builders.ApiInfoBuilder
import springfox.documentation.builders.PathSelectors
import springfox.documentation.builders.RequestHandlerSelectors
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spring.web.plugins.Docket
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc

@Configuration
@EnableSwagger2WebMvc
class Knife4jConfiguration {

    @Bean
    fun defaultApi2(): Docket {
        return Docket(DocumentationType.SWAGGER_2).apiInfo(
            ApiInfoBuilder().description("swagger-bootstrap-ui").termsOfServiceUrl("demo.cn")
                .version("1.0")
                .build()
        ).groupName("2.0")
            .select()
            .apis(RequestHandlerSelectors.basePackage("com.me.dogdog.controller"))
            .paths(PathSelectors.any())
            .build()
    }
}