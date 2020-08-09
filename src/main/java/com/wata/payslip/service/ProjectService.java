package com.wata.payslip.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.wata.payslip.model.DTO.ProjectDTO;
import com.wata.payslip.model.entity.ProjectEntity;
import com.wata.payslip.repository.ProjectRepository;

@Service
public class ProjectService {
	@Autowired
	private ProjectRepository projectRepository;

	public ResponseEntity<String> createProject(ProjectDTO project) {
		// TODO Auto-generated method stub

		ProjectEntity projectEntity = new ProjectEntity();
		BeanUtils.copyProperties(project, projectEntity);
		projectRepository.save(projectEntity);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	public List<ProjectDTO> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
