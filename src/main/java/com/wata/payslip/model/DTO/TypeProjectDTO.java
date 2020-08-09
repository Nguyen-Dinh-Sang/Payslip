package com.wata.payslip.model.DTO;

import java.util.Set;

import com.wata.payslip.model.entity.ProjectEntity;

public class TypeProjectDTO {
	private Set<ProjectEntity> projectEntities;
	private int id;
	private String typeName;
	
	public TypeProjectDTO() {
	}

	public TypeProjectDTO(Set<ProjectEntity> projectEntities, int id, String typeName) {
		this.projectEntities = projectEntities;
		this.id = id;
		this.typeName = typeName;
	}

	public Set<ProjectEntity> getProjectEntities() {
		return projectEntities;
	}

	public void setProjectEntities(Set<ProjectEntity> projectEntities) {
		this.projectEntities = projectEntities;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
}
