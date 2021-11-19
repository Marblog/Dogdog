package com.me.dogdog

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import java.net.Inet4Address

@SpringBootApplication
class DogdogApplication

fun main(args: Array<String>) {
    val ip = Inet4Address.getLocalHost().toString().substring(16)
    runApplication<DogdogApplication>(*args)
    println("启动成功，后台接口地址:https://localhost:8080/doc.html")
    println("https://$ip:8080/doc.html")
}
