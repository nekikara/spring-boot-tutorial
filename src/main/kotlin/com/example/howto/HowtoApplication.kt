package com.example.howto

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class HowtoApplication

fun main(args: Array<String>) {
    SpringApplication.run(HowtoApplication::class.java, *args)
}

