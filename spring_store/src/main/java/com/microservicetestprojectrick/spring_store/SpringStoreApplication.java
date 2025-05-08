package com.microservicetestprojectrick.spring_store;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringStoreApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringStoreApplication.class, args);
		var orderService = context.getBean(OrderService.class);
		// var orderService = new OrderService(new PaypalPaymentService());
		// orderService.setPaymentService(new PaypalPaymentService());;
		orderService.placeOrder();
	}

}
