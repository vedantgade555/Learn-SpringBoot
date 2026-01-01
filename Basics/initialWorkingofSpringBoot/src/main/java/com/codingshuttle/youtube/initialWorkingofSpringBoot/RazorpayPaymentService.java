package com.codingshuttle.youtube.initialWorkingofSpringBoot;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component // Scan and make a bean of this class and store in it
@ConditionalOnProperty(name = "payment.provider" , havingValue = "razorpay")
public class RazorpayPaymentService implements PaymentService {

    @Override
    public String pay(){
        String payment = "Razorpay Payment";
        System.out.println("Payment From: "+payment);
        return payment;
    }
}
