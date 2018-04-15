package com.mall.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mall.dubbo.service.HelloService;

/**
 * Hello world!
 *
 */
public class consumerApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		HelloService helloService = (HelloService) context.getBean("helloService1");
		System.out.println(helloService.sayHello("yhx"));
	}
}
