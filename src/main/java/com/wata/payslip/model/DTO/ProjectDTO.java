package com.wata.payslip.model.DTO;

import java.util.Date;
import java.util.Set;

import com.wata.payslip.model.entity.AssignmentEntity;
import com.wata.payslip.model.entity.TypeProjectEntity;
import com.wata.payslip.model.entity.WorkEntity;

public class ProjectDTO {
	public TypeProjectEntity typeProject;
	private Set<AssignmentEntity> assignmentEntities;
	private Set<WorkEntity> workEntities;
	private Integer idProject;
	private String nameProject;
	private Date startDate;
	private Date endDate;
	private String description;
	
	public ProjectDTO() {
		
	}

	public ProjectDTO(TypeProjectEntity typeProject, Set<AssignmentEntity> assignmentEntities,
			Set<WorkEntity> workEntities, Integer idProject, String nameProject, Date startDate, Date endDate,
			String description) {
		this.typeProject = typeProject;
		this.assignmentEntities = assignmentEntities;
		this.workEntities = workEntities;
		this.idProject = idProject;
		this.nameProject = nameProject;
		this.startDate = startDate;
		this.endDate = endDate;
		this.description = description;
	}

	public TypeProjectEntity getTypeProject() {
		return typeProject;
	}

	public void setTypeProject(TypeProjectEntity typeProject) {
		this.typeProject = typeProject;
	}

	public Set<AssignmentEntity> getAssignmentEntities() {
		return assignmentEntities;
	}

	public void setAssignmentEntities(Set<AssignmentEntity> assignmentEntities) {
		this.assignmentEntities = assignmentEntities;
	}

	public Set<WorkEntity> getWorkEntities() {
		return workEntities;
	}

	public void setWorkEntities(Set<WorkEntity> workEntities) {
		this.workEntities = workEntities;
	}

	public Integer getIdProject() {
		return idProject;
	}

	public void setIdProject(Integer idProject) {
		this.idProject = idProject;
	}

	public String getNameProject() {
		return nameProject;
	}

	public void setNameProject(String nameProject) {
		this.nameProject = nameProject;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}