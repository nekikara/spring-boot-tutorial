package com.example.howto

import org.springframework.stereotype.Component
import org.springframework.web.servlet.HandlerExceptionResolver
import org.springframework.web.servlet.ModelAndView
import java.lang.Exception
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse
import org.springframework.web.bind.annotation.RestController
import com.fasterxml.jackson.databind.util.ClassUtil.getDeclaringClass
import org.springframework.web.method.HandlerMethod


@Component
class MyExceptionResolver : HandlerExceptionResolver {

    override fun resolveException(request: HttpServletRequest, response: HttpServletResponse, handler: Any, ex: Exception): ModelAndView? {
        if (isRestController(handler)) {
            return null
        }

        val mv = ModelAndView()
        mv.viewName = "my-error"

        return mv
    }

    private fun isRestController(handler: Any): Boolean {
        if (handler is HandlerMethod) {

            return handler.method.declaringClass.isAnnotationPresent(RestController::class.java)
        }

        return false
    }
}
