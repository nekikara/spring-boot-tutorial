package com.example.howto

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.*

@Controller
@RequestMapping("/hello")
class HelloController {

    @RequestMapping(method = arrayOf(RequestMethod.GET))
    fun hello(model: Model): String {
        var hoge = Hoge()

        hoge.id = 10
        hoge.value = "hoge"

        model.addAttribute("myData", hoge)

        return "hello"
    }
}
