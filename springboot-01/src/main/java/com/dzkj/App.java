package com.dzkj;

import javax.servlet.Filter;
import javax.servlet.Servlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import com.dzkj.filter.SecondFilter;
import com.dzkj.listener.SecondLinstener;
import com.dzkj.servlet.SecondServlet;

//扫描本包或子包下的注解组件
@SpringBootApplication
@ServletComponentScan
public class App {
	public static void main(String[] args) {
		//springboot开机
		SpringApplication.run(App.class, args);
	}
	
	@Bean
	public ServletRegistrationBean<Servlet> get(){
		ServletRegistrationBean<Servlet> bean = new ServletRegistrationBean<Servlet>(new SecondServlet());
		bean.addUrlMappings("/Second");
		return bean;
	}
	
	@Bean
	public FilterRegistrationBean<Filter> getFilter(){
		FilterRegistrationBean<Filter> bean = new FilterRegistrationBean<>(new SecondFilter());
		bean.addUrlPatterns("/*");
		return bean;
	}
	
	@Bean
	public ServletListenerRegistrationBean getListener(){
		ServletListenerRegistrationBean bean = new ServletListenerRegistrationBean(new SecondLinstener());
		return bean;
	}
	
}
