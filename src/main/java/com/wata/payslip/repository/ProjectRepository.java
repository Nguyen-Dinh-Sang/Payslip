package com.wata.payslip.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wata.payslip.model.entity.ProjectEntity;

@Repository
public interface ProjectRepository extends JpaRepository<ProjectEntity, Integer> {

	ProjectEntity findByIdProject(int Id);

	ProjectEntity save(Optional<ProjectEntity> projectEntity);

}
