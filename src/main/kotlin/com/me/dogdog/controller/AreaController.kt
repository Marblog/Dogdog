package com.me.dogdog.controller

import com.me.dogdog.entity.Area
import com.me.dogdog.service.AreaService
import io.swagger.annotations.Api
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@Api(value = "首页模块")
class AreaController {

    @Autowired
    lateinit var areaService: AreaService

    @RequestMapping("/listById")
    fun listById(id: String): Area? {
        return areaService.getById(id)
    }

    @GetMapping("/listByPage")
    fun listByPage(limit: Int, pageSize: Int): List<Area?> {
        return areaService.selectByPage(limit, pageSize)
    }
}