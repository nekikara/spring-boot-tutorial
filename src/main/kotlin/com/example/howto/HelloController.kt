package com.example.howto

import org.springframework.http.HttpStatus
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*

@Controller
@RequestMapping("/hello")
class HelloController {

    @RequestMapping(method = arrayOf(RequestMethod.GET))
    fun hello() = "hello"
}
