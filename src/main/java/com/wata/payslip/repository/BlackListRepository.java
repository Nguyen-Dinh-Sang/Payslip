package com.wata.payslip.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wata.payslip.model.entity.BlackListEntity;

@Repository
public interface BlackListRepository extends JpaRepository<BlackListEntity, Long> {

	BlackListEntity findByToken(String token);

	void deleteByToken(String token);
}
