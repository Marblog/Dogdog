package com.me.dogdog.service.impl

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import com.me.dogdog.entity.Area
import com.me.dogdog.mapper.AreaMapper
import com.me.dogdog.service.AreaService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class AreaServiceImpl : ServiceImpl<AreaMapper?, Area?>(), AreaService {

    @Autowired
    lateinit var areaMapper: AreaMapper

    override fun selectByPage(limit: Int, pageSize: Int): List<Area?> {
      return areaMapper.selectByPage(limit, pageSize)
    }


}