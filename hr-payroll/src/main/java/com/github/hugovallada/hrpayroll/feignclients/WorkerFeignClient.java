package com.github.hugovallada.hrpayroll.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.github.hugovallada.hrpayroll.entities.Worker;

@Component
@FeignClient(name = "hr-worker", path = "/workers")
public interface WorkerFeignClient {
	
	// a interface seria a msm coisa q o método do controller
	@GetMapping("/{id}")
	ResponseEntity<Worker> findById(@PathVariable Long id);
	
}
