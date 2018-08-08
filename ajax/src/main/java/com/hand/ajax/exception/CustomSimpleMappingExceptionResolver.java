package com.hand.ajax.exception;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

@Component
public class CustomSimpleMappingExceptionResolver extends SimpleMappingExceptionResolver {

	private Log log = LogFactory.getLog(CustomSimpleMappingExceptionResolver.class);
    @Override
    protected ModelAndView doResolveException(HttpServletRequest request, 
        HttpServletResponse response, Object handler, Exception ex) {

        // 判断是否 Ajax 请求 
         if ((request.getHeader("accept").indexOf("application/json") > -1 ||
           (request.getHeader("X-Requested-With") != null && 
           request.getHeader("X-Requested-With").indexOf("XMLHttpRequest") > -1))){

            try {
                response.setContentType("text/html;charset=UTF-8");
                response.setCharacterEncoding("UTF-8");
                PrintWriter writer = response.getWriter();
                writer.write(ex.getMessage());
                writer.flush();
                writer.close();
            } catch (Exception e) {
                log.debug(e);
            }
            return null;
        }

        return super.doResolveException(request, response, handler, ex);
    }
}