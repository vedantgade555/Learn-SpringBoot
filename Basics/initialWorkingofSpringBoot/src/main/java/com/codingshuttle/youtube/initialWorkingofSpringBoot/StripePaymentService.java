package com.codingshuttle.youtube.initialWorkingofSpringBoot;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

//@Component //below components all have same meaning
//@Service
//@RestController
//@Repository
@Component //below components all have same meaning
@ConditionalOnProperty(name = "payment.provider" , havingValue = "stripe")
public class StripePaymentService implements PaymentService{

    @Override
    public String pay(){
        String payment = "Stripe Payment";
        System.out.println("Payment From: "+payment);
        return payment;
    }

}
