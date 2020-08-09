package com.wata.payslip.model.entity;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "workTime")
public class WorkTimeEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idWorktime;

	@ManyToOne()
	@JoinColumn(name = "IdEmployee", insertable = false, updatable = false)
	private EmployeeEntity idEmployee;

	@ManyToOne()
	@JoinColumn(name = "IdWork", insertable = false, updatable = false)
	private WorkEntity idwork;

	@Column(name = "StartTime")
	private Timestamp startTime;

	@Column(name = "EndTime")
	private Timestamp endTime;

	@Column(name = "Hour")
	private Time hour;

	public WorkTimeEntity() {

	}

	public WorkTimeEntity(Integer idWorktime, EmployeeEntity idEmployee, WorkEntity idwork, Timestamp startTime,
			Timestamp endTime, Time hour) {
		super();
		this.idWorktime = idWorktime;
		this.idEmployee = idEmployee;
		this.idwork = idwork;
		this.startTime = startTime;
		this.endTime = endTime;
		this.hour = hour;
	}

	public Integer getIdWorktime() {
		return idWorktime;
	}

	public void setIdWorktime(Integer idWorktime) {
		this.idWorktime = idWorktime;
	}

	public WorkEntity getIdwork() {
		return idwork;
	}

	public void setIdwork(WorkEntity idwork) {
		this.idwork = idwork;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Timestamp startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Timestamp endTime) {
		this.endTime = endTime;
	}

	public Time getHour() {
		return hour;
	}

	public void setHour(Time hour) {
		this.hour = hour;
	}

	public EmployeeEntity getIdEmployee() {
		return idEmployee;
	}

	public void setIdEmployee(EmployeeEntity idEmployee) {
		this.idEmployee = idEmployee;
	}

}
