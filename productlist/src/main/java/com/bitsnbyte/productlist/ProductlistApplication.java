package com.bitsnbyte.productlist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ProductlistApplication {

	public static void main(String[] args) {

		ApplicationContext context =
				SpringApplication.run(ProductlistApplication.class, args);

//		MyComponent myComponent = context.getBean(MyComponent.class);
//		MyApp myComponent = context.getBean(MyComponent.class);
//		myComponent.getMessage();

		MyApp myApp = context.getBean(MyApp.class);
		myApp.run();
	}
}
