package ru.in28minutes.microservices.currency_exchange_service.controller;

import io.github.resilience4j.bulkhead.annotation.Bulkhead;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import io.github.resilience4j.retry.annotation.Retry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;



@RestController
public class CircuitBreakerController {

    private final Logger logger = LoggerFactory.getLogger(CircuitBreakerController.class);

    @GetMapping("/sample-api")
//    @Retry(name = "sample-api", fallbackMethod = "hardcodedResponse")
//    @CircuitBreaker(name = "sample-api", fallbackMethod = "hardcodedResponse")
//    @RateLimiter(name="default")
    @Bulkhead(name="default")
    public String sampleApi() {
//        logger.info("Sample API request received");
//        ResponseEntity<String> forEntity = new RestTemplate().getForEntity(
//                "http://localhost:8080/some-api", String.class);
//
//        return forEntity.getBody();
        return "Sample API";
    }

    public String hardcodedResponse(Exception ex) {
        return "hardcodedResponse";
    }
}
