package com.example.howto

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class WebApiController {
    @Autowired
    private val hogeRepository: HogeRepository? = null

    @RequestMapping(method = arrayOf(RequestMethod.GET))
    fun method1() {
        throw MyException("test exception")
    }

    @RequestMapping(value="/null", method = arrayOf(RequestMethod.GET))
    fun method2() {
        throw NullPointerException("test exception")
    }

    @ExceptionHandler(NullPointerException::class)
    fun handling(e: NullPointerException): String {
        return "{\"message\":\"" + e.message + "\"}"
    }

    @RequestMapping(value="/hoge/all", method = arrayOf(RequestMethod.GET))
    fun all(): MutableIterable<Hoge>? = hogeRepository!!.findAll()
}
