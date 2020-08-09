package com.wata.payslip.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Assigment")
public class AssignmentEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "IdAssigment")
	private Integer id;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "idProject", nullable = false)
	private ProjectEntity idProject;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "idEmployee", nullable = false)
	private EmployeeEntity idEmployee;

	public AssignmentEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AssignmentEntity(Integer id, ProjectEntity projectEntity, EmployeeEntity employeeEntity) {
		super();
		this.id = id;
		this.idProject = projectEntity;
		this.idEmployee = employeeEntity;
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