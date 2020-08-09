package com.wata.payslip.model.entity;

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
@Table(name = "Work")
public class WorkEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "IdWork")
	private Integer idWork;

	@OneToMany(mappedBy = "idwork", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<WorkTimeEntity> idWorktime;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "IdProject", insertable = false, updatable = false)
	private ProjectEntity projectEntity;

	@Column(name = "IdProject")
	private Integer idProject;

	@Column(name = "Summary")
	private String summary;

	@Column(name = "Explain")
	private String explain;

	public WorkEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public WorkEntity(Integer idWork, Set<WorkTimeEntity> idWorktime, ProjectEntity projectEntity, Integer idProject,
			String summary, String explain) {
		super();
		this.idWork = idWork;
		this.idWorktime = idWorktime;
		this.projectEntity = projectEntity;
		this.idProject = idProject;
		this.summary = summary;
		this.explain = explain;
	}

	public Integer getIdWork() {
		return idWork;
	}

	public void setIdWork(Integer idWork) {
		this.idWork = idWork;
	}

	public Integer getIdProject() {
		return idProject;
	}

	public void setIdProject(Integer idProject) {
		this.idProject = idProject;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getExplain() {
		return explain;
	}

	public void setExplain(String explain) {
		this.explain = explain;
	}

	public Set<WorkTimeEntity> getIdWorktime() {
		return idWorktime;
	}

	public void setIdWorktime(Set<WorkTimeEntity> idWorktime) {
		this.idWorktime = idWorktime;
	}

	public ProjectEntity getProjectEntity() {
		return projectEntity;
	}

	public void setProjectEntity(ProjectEntity projectEntity) {
		this.projectEntity = projectEntity;
	}

}