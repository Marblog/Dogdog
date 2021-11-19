package com.me.dogdog.controller

import io.swagger.annotations.Api
import io.swagger.annotations.ApiImplicitParam
import io.swagger.annotations.ApiOperation
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@Api(value = "首页模块")
@RestController
class HelloController {


    @RequestMapping("/hello")
    @ApiOperation(value = "向客人问好")
    @ApiImplicitParam(name = "name", value = "姓名", required = true)
    fun helloController(name:String):Map<String, String> {
        return hashMapOf("name" to name,"age" to "22")
    }
}