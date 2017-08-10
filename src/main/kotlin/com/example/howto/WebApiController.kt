package com.example.howto

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class WebApiController {

    @RequestMapping(method = arrayOf(RequestMethod.GET))
    fun method1() {
        throw MyException("test exception")
    }
}
