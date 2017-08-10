package com.example.howto

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus

@ResponseStatus(HttpStatus.BAD_REQUEST)
class MyException(msg: String) : RuntimeException(msg) {
    companion object {
        private val serialVersionUID = 1L
    }
}
