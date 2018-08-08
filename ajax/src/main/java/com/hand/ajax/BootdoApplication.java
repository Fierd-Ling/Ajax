package com.hand.ajax;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * 
 * @ClassName: BootdoApplication
 * 
 * @Description: tomcat启动入口
 * 
 * @author ZhongLingYun
 * 
 * @date 2018年8月7日 下午3:45:49
 * 
 */
@SpringBootApplication
public class BootdoApplication extends SpringBootServletInitializer {
	public static void main(String[] args) {
		SpringApplication.run(BootdoApplication.class, args);
	}

	/**
	 * 
	 * Title: configure
	 * 
	 * Description: 调用springboot启动入口来启动项目
	 * 
	 * @param builder
	 * 
	 * @see org.springframework.boot.web.servlet.support.SpringBootServletInitializer#configure(org.springframework.boot.builder.SpringApplicationBuilder)
	 * 
	 */
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(Application.class);
	}
}
