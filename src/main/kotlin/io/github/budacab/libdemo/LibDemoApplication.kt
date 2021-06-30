package io.github.budacab.libdemo

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
object LibDemoApplication {
    @JvmStatic
    fun main(args: Array<String>) {
        SpringApplication.run(LibDemoApplication::class.java, *args)
    }
}