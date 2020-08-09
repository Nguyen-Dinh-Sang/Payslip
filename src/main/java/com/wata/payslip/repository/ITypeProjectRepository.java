package com.wata.payslip.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import com.wata.payslip.model.entity.TypeProjectEntity;

public interface ITypeProjectRepository extends JpaRepository<TypeProjectEntity, Integer>{
	Page<TypeProjectEntity> findByTypeNameContaining(String typeName, Pageable pageable);
	TypeProjectEntity findOneById(Integer id);
}
