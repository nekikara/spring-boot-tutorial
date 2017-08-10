package com.example.howto

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.*
import java.util.*

@Controller
@RequestMapping("/hello")
class HelloController {

    @RequestMapping(method = arrayOf(RequestMethod.GET))
    fun hello(model: Model): String {
        val list = listOf(
            mapOf("id" to 40, "value" to "hoge"),
            mapOf("id" to 30, "value" to "tore"),
            mapOf("id" to 60, "value" to "fetch"),
            mapOf("id" to 70, "value" to "hugu")
        ).map { Hoge(it.get("id") as Int?, it.get("value") as String?) }

        model.addAttribute("hogeList", list)

        return "hello"
    }
}
