package com.me.dogdog.entity

import com.baomidou.mybatisplus.annotation.TableId

data class Area(

    @TableId
    var id: Long?,
    var name: String?,
    var pid: Long?,
    var province_code: Long?,
    var city_code: Long?,
    var area_code: Long?,
    var street_code: Long?,
    var committee_code: Long?,
    var committee_type: Int?,
    var sort: Int?,
    var level: Int?,

)
