package com.wata.payslip.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wata.payslip.model.DTO.TypeProjectDTO;
import com.wata.payslip.service.ITypeProjectService;

@RestController
@RequestMapping("/api/typeproject")
public class TypeProjectController {
	@Autowired
	private ITypeProjectService iTypeProjectService;
	
	@RequestMapping(value = "/create", headers = "Accept=application/json", method = RequestMethod.POST)
	public TypeProjectDTO createTypeProject(@Validated @RequestBody TypeProjectDTO dto) {
		return iTypeProjectService.createTypePreject(dto);
	}
}
