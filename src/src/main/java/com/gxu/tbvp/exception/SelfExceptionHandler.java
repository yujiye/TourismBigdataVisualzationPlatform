package com.gxu.tbvp.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;


//所有发生的异常都会被此类捕获
@ControllerAdvice
public class SelfExceptionHandler {
	
	public static final String ERROR_VIEW = "404";
	
	@ExceptionHandler(value = Exception.class)
	public Object errorHandler(HttpServletRequest request,
			HttpServletResponse response, Exception e) throws Exception {
		
		e.printStackTrace();
		
		if (isAjax(request)) {
			return SelfJSONResult.errorException(e.getMessage());
		}
		else {
			ModelAndView mav = new ModelAndView();
			mav.addObject("exception", e);
			mav.addObject("url", request.getRequestURI());
			mav.setViewName(ERROR_VIEW);
			return mav;
		}
	}
	
	/**
	 * 
	 * @Title: ExceptionHandler.java
	 * @Description: 判断是否是ajax请求
	 * Copyright: Copyright (c) 2017
	 * Company:FURUIBOKE.SCIENCE.AND.TECHNOLOGY
	 * 
	 */
	public static boolean isAjax(HttpServletRequest httpRequest) {
		return (httpRequest.getHeader("X-Requested-With") != null 
				&& "XMLHttpRequest"
					.equals(httpRequest.getHeader("X-Request-With").toString()));
	}
}


