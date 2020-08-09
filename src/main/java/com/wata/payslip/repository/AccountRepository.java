package com.wata.payslip.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.wata.payslip.model.entity.AccountEntity;

public interface AccountRepository extends JpaRepository<AccountEntity, Integer> {
	public Optional<AccountEntity> findByUserName(String string);

	public AccountEntity findByTokenAndUserName(String string, String string2);

	public AccountEntity findByToken(String token);

	@Query(value = "select * from useraccount u where u.email = ?1", nativeQuery = true)
	public AccountEntity myCustomQuery2(String emailAddress);

	// public EmployeeAccount findByAndUserName(String string, String string2);

}
