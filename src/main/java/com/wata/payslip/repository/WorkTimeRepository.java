package com.wata.payslip.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wata.payslip.model.entity.WorkTimeEntity;

public interface WorkTimeRepository extends JpaRepository<WorkTimeEntity, Integer> {

}
