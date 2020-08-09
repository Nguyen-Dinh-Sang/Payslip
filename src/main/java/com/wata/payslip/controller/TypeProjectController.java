package com.wata.payslip.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wata.payslip.model.DTO.SearchData;
import com.wata.payslip.model.DTO.TypeProjectDTO;
import com.wata.payslip.service.ITypeProjectService;

@RestController
@RequestMapping("/api/typeproject")
public class TypeProjectController {
	@Autowired
	private ITypeProjectService iTypeProjectService;
	
	@RequestMapping(value = "/create", headers = "Accept=application/json", method = RequestMethod.POST)
	public ResponseEntity<Map<String, Object>> createTypeProject(@Validated @RequestBody TypeProjectDTO dto) {
		return iTypeProjectService.createTypePreject(dto);
	}
	
	@GetMapping("/")
	public ResponseEntity<Map<String, Object>> getAllTypeProject() {
		return iTypeProjectService.getAllTypeProject();
	}

	
	@GetMapping("/{id}")
	public ResponseEntity<Map<String, Object>> getTypeProjectById(@PathVariable(value = "id") Integer id) {
		return iTypeProjectService.getTypeProjectById(id);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Map<String, Object>> deleteTypeProjectById(@PathVariable(value = "id") Integer id) {
		return iTypeProjectService.deleteTypeProjectById(id);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Map<String, Object>> updateTypeProjectById(@RequestBody TypeProjectDTO dto, @PathVariable Integer id) {
		return iTypeProjectService.updateTypeProjectById(dto, id);
	}
	
	@RequestMapping(value = "/pages", method = RequestMethod.POST)
	public ResponseEntity<Map<String, Object>> searchTypeByTypeName(@RequestBody SearchData searchData) {
		// default currentPage = 0, pageSize = 3
		return iTypeProjectService.searchTypeByTypeName(searchData);
	}
}
