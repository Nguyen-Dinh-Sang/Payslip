package com.wata.payslip.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wata.payslip.model.DTO.AssignmentDTO;
import com.wata.payslip.service.AssignmentService;

@RestController
@RequestMapping("/api/general")
public class AssignmentController {
	@Autowired
	private AssignmentService assignService;

	@RequestMapping(value = "/assignment", headers = "Accept=application/json", method = RequestMethod.POST)
	public ResponseEntity<String> assignment(@RequestBody AssignmentDTO project) {
		AssignmentDTO assignment = project;
		// return project;
		return assignService.assignment(assignment);
	}
}
