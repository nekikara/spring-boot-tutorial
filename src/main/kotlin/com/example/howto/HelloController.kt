package com.example.howto

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/hello")
class HelloController {

    @RequestMapping(method = arrayOf(RequestMethod.GET))
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    fun getMethod() {
    }
}
