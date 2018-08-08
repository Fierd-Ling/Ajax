package com.hand.ajax.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 * @ClassName: ResolverException
 * 
 * @Description:全局异常捕获，处理全局异常，包括未定位的异常
 * 
 * @author ZhongLingYun
 * 
 * @date 2018年8月8日 下午2:46:40
 * 
 */
@Component
public class ResolverException implements HandlerExceptionResolver {
	
	private final Log log = LogFactory.getLog(ResolverException.class);

	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
			Exception ex) {
		log.debug(ex.toString());
		// 普通异常，不能处理ajax
		// 根据不同错误转向不同页面
		if (ex instanceof NumberFormatException) {
			System.out.println("---------------------------------------------------------");
			return new ModelAndView("/ajax/index.html");
		} else {
			System.out.println("---------------------------------------------------------");
			return new ModelAndView("/ajax/index.html");
		}
	}

}
