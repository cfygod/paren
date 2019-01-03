package com.cfygit.webapi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 参考：https://blog.csdn.net/u012734441/article/details/78256256?locationNum=1&fps=1
 *enableEurekaClient 和discoveryclient 区别在于， discoverclient 基于spring-cloud-commons
 * enableEurekaClient 基于 spring-cloud-netfilx ，如果注册中心是eureka 那就用enableEurakaClient
 * 其他的注册中心应该是 用discoverClinet
 *
 * 参考：https://blog.csdn.net/u010066934/article/details/80967709
 * feign的工作原理是
 * 首先通过包扫描注入feignClinet的bean，该源码在FeignClientsRegistrar
 * 首先检查启动配置是否有@EnableFeignClients如果有则会去扫描是否有FeignCliens 注解
 * 当类上面有FeignClient注解 则会取出他的配置信息,然后注入ioc 容器中
 * 用的是BeanDefinition
 * 在feignClientRegistar 中完成了feign的注册
 * 在reflectiveFeign内部使用了jdk的动态代理，因为jdk的动态代理要实现一个invacationHandler
 * 所以reflectiveFeign 实现了一个，然后还需要一个proxy一个动态代理的类。在这个过程中也会为每个方法生成
 * SychronousMethodHandler 拦截器，用来处理解析方法上的元数据，生成一个http请求模板
 */

@RestController
@SpringBootApplication
@MapperScan("com.cfygit.webapi.mapper")
@EnableEurekaClient
@EnableFeignClients
public class WebApiApplication {


	public static void main(String[] args) {
		SpringApplication.run(WebApiApplication.class, args);
	}



}

