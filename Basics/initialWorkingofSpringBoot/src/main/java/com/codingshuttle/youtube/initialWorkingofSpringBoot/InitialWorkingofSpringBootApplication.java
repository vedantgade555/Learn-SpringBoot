package com.codingshuttle.youtube.initialWorkingofSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InitialWorkingofSpringBootApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(InitialWorkingofSpringBootApplication.class, args);
	}

	//@Autowired // this will also used to dependency injection
//	private final RazorpayPaymentService paymentService;
	private final PaymentService paymentService;


	// We are created dependency. this is Constructor deoendency injection .. this will be better
//	public InitialWorkingofSpringBootApplication(RazorpayPaymentService paymentService) {
//		this.paymentService = paymentService;
//	}


	public InitialWorkingofSpringBootApplication(PaymentService paymentService) {
		this.paymentService = paymentService;
	}

	@Override
	public void run(String... args) throws Exception{
		String payment = paymentService.pay();
		System.out.println("Payment done: "+payment);
	}
}
