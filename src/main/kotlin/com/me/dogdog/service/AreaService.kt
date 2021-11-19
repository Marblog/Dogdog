package com.me.dogdog.service

import com.baomidou.mybatisplus.extension.service.IService
import com.me.dogdog.entity.Area

interface AreaService : IService<Area?> {

    fun selectByPage(limit: Int, pageSize: Int): List<Area?>
}