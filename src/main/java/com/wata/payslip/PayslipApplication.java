package com.wata.payslip;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PayslipApplication {
	@Autowired

	public static void main(String[] args) {
		SpringApplication.run(PayslipApplication.class, args);
	}

}
