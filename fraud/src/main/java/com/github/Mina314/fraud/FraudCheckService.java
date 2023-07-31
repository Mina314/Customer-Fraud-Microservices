package com.github.Mina314.fraud;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class FraudCheckService {
//    2. store there was a check
    private final FraudCheckHistoryRepository fraudCheckHistoryRepository;

//    1. perform a check in customer
    public boolean isFraudulentCustomer(Integer customerId) {
        fraudCheckHistoryRepository.save(
                FraudCheckHistory.builder()
                        .customerId(customerId)
                        .isFraudster(false)
                        .createdAt(LocalDateTime.now())
                        .build()
        );
        // assume there is no fraud
        return false;
        // in real world, we can use third party system to check on emails etc
    }
}
