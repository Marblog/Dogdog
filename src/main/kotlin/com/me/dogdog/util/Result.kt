package com.me.dogdog.util

class Result<T> {
    /*响应码*/
    private var code = 0

    /*响应消息*/
    private var msg: String? = null

    /*数据单元*/
    private var data: T? = null

    constructor() {}
    constructor(data: T) {
        this.data = data
    }

    constructor(code: Int, msg: String?) {
        this.code = code
        this.msg = msg
    }

    companion object {
        /**
         * 成功时候的调用
         */
        fun <T> success(data: T): Result<T> {
            return Result(data)
        }

        /**
         * 失败时候的调用
         */
        fun <T> error(code: Int, msg: String?): Result<T> {
            return Result(code, msg)
        }
    }
}