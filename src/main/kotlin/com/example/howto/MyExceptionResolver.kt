package com.example.howto

import org.springframework.stereotype.Component
import org.springframework.web.servlet.HandlerExceptionResolver
import org.springframework.web.servlet.ModelAndView
import java.lang.Exception
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

@Component
class MyExceptionResolver : HandlerExceptionResolver {

    override fun resolveException(request: HttpServletRequest, response: HttpServletResponse, handler: Any, ex: Exception): ModelAndView {
        println(ex.javaClass.toString() + " : " + ex.message)

        val mv = ModelAndView()
        mv.viewName = "my-error"

        return mv
    }
}
