package com.wata.payslip.model.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Project")
public class ProjectEntity {	
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "typeProject", nullable = false)
	public TypeProjectEntity typeProject;
	
	@OneToMany(mappedBy = "idProject", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<AssignmentEntity> assignmentEntities;

	@OneToMany(mappedBy = "projectEntity", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<WorkEntity> workEntities;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "IdProject")
	private Integer idProject;

	@Column(name = "NameProject")
	private String nameProject;

	@Column(name = "StartDate")
	private Date startDate;

	@Column(name = "EndDate")
	private Date endDate;

	@Column(name = "Description")
	private String description;

	public ProjectEntity() {

	}

	public ProjectEntity(TypeProjectEntity typeProject, Set<AssignmentEntity> assignmentEntities,
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