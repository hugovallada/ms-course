package com.github.hugovallada.hrpayroll.entities;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@SuppressWarnings("serial")
public class Payment implements Serializable {
	
	private String name;
	
	private Double dailyIncome;
	
	private Integer days;
	
	public double getTotal() {
		return dailyIncome * days;
	}
}
