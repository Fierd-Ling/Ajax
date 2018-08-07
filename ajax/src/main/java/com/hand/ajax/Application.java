package com.hand.ajax;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 
 * @ClassName: Application
 * 
 * @Description:spring boot启动入口
 * 
 * @author ZhongLingYun
 * 
 * @date 2018年8月7日 下午4:43:32
 * 
 */
@SpringBootApplication
@MapperScan("com.hand.ajax.mapper")
public class Application {
	private static Log log = LogFactory.getLog(Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		log.info("启动完毕");

	}
}