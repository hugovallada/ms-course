package com.github.hugovallada.hrpayroll.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.hugovallada.hrpayroll.entities.Payment;
import com.github.hugovallada.hrpayroll.services.PaymentService;

@RestController
@RequestMapping("/payments")
public class PaymentResources {
	
	@Autowired
	private PaymentService service;
	
	@GetMapping("/{workerId}/days/{days}")
	public ResponseEntity<Payment> getPayment(
			@PathVariable Long workerId,
			@PathVariable Integer days
			){
		return ResponseEntity.ok().body(service.getPayment(workerId, days));
	}

}
