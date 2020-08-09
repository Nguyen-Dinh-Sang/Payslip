package com.wata.payslip.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.wata.payslip.model.DTO.AssignmentDTO;
import com.wata.payslip.model.entity.AssignmentEntity;
import com.wata.payslip.repository.AssignmentRepository;

@Service
public class AssignmentService {

	@Autowired
	private AssignmentRepository assignmentRepository;

	public ResponseEntity<String> assignment(AssignmentDTO project) {
		// TODO Auto-generated method stub
		AssignmentEntity AssignmentEntity = new AssignmentEntity();
		BeanUtils.copyProperties(project, AssignmentEntity);
		assignmentRepository.save(AssignmentEntity);
		return new ResponseEntity<>(HttpStatus.OK);

	}
}
