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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Employee")
public class EmployeeEntity {
	private int id;

	private String fullName;
	private String email;
	private String telephone;

	@Column(name = "birthday", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date birthday;

	@Column(name = "joinDay", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date joinDay;

	@OneToMany(mappedBy = "employeeEntity")
	private Set<WorkTimeEntity> workTimeEtity;

	public EmployeeEntity() {
		// Add here init stuff if needed
	}

	@OneToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "user_id", nullable = false)
	private AccountEntity employeeAccount;

	@OneToMany(mappedBy = "idEmployee", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<AssignmentEntity> assignmentEntity;

	public EmployeeEntity(int id, String name, String email, String tel, java.util.Date birthdate,
			java.util.Date joindate) {
		this.id = id;
		this.fullName = name;
		this.email = email;
		this.telephone = tel;
		this.birthday = birthdate;
		this.joinDay = joindate;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "fullname", nullable = false)
	public String getFullName() {
		return fullName;
	}

	public void setFullName(String lastName) {
		this.fullName = lastName;
	}

	@Column(name = "email", nullable = false)
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "telephone", nullable = false)
	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String string) {
		this.telephone = string;
	}

	public java.util.Date getBirthday() {
		return birthday;
	}

	public void setBirthday(java.util.Date birthdate) {
		this.birthday = birthdate;
	}

	public java.util.Date getJoinDay() {
		return joinDay;
	}

	public void setJoinDay(java.util.Date joindate) {
		this.joinDay = joindate;
	}

}
