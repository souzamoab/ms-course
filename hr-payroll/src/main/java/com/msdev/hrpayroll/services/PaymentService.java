package com.msdev.hrpayroll.services;

import com.msdev.hrpayroll.entities.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public Payment getPayment(Long workerId, Integer days) {
        return new Payment("Moab", 100.0, days);
    }

}
