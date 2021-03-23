package com.github.hugovallada.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.hugovallada.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker,Long> {

}
