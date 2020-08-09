package com.wata.payslip.model.DTO;

import com.wata.payslip.model.entity.EmployeeEntity;
import com.wata.payslip.model.entity.ProjectEntity;

public class AssignmentDTO {

	private Integer id;

	private ProjectEntity idProject;

	private EmployeeEntity idEmployee;

	public AssignmentDTO() {
		// TODO Auto-generated constructor stub
	}

	public AssignmentDTO(Integer id, ProjectEntity idProject, EmployeeEntity idEmployee) {
		this.id = id;
		this.idProject = idProject;
		this.idEmployee = idEmployee;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public ProjectEntity getIdProject() {
		return idProject;
	}

	public void setIdProject(ProjectEntity projectEntity) {
		this.idProject = projectEntity;
	}

	public EmployeeEntity getIdEmployee() {
		return idEmployee;
	}

	public void setIdEmployee(EmployeeEntity employeeEntity) {
		this.idEmployee = employeeEntity;
	}

}