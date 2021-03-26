package com.github.hugovallada.hrpayroll.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.hugovallada.hrpayroll.entities.Payment;
import com.github.hugovallada.hrpayroll.services.PaymentService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping("/payments")
public class PaymentResources {
	
	@Autowired
	private PaymentService service;
	
	@HystrixCommand(fallbackMethod = "getPaymentAlternative")
	@GetMapping("/{workerId}/days/{days}")
	public ResponseEntity<Payment> getPayment(
			@PathVariable Long workerId,
			@PathVariable Integer days
			){
		return ResponseEntity.ok().body(service.getPayment(workerId, days));
	}
	
	public ResponseEntity<Payment> getPaymentAlternative(Long workerId, Integer days){
		Payment payment = new Payment("Brann", 400.0, days);
		return ResponseEntity.ok(payment);
	}

}
