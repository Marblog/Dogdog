package com.me.dogdog.mapper

import com.baomidou.mybatisplus.core.mapper.BaseMapper
import com.me.dogdog.entity.Area
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Param

@Mapper
interface AreaMapper : BaseMapper<Area?> {


    fun selectByPage(@Param("limit") limit: Int, @Param("pageSize") pageSize: Int): List<Area?>
}