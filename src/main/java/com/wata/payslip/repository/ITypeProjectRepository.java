package com.wata.payslip.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.wata.payslip.model.entity.TypeProjectEntity;

public interface ITypeProjectRepository extends JpaRepository<TypeProjectEntity, Integer>{

}
