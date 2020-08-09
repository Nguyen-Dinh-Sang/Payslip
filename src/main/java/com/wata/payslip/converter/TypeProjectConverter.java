package com.wata.payslip.converter;

import org.springframework.stereotype.Component;

import com.wata.payslip.model.DTO.TypeProjectDTO;
import com.wata.payslip.model.entity.TypeProjectEntity;

@Component
public class TypeProjectConverter {
	
	public TypeProjectEntity toEntity (TypeProjectDTO dto) {
		TypeProjectEntity entity = new TypeProjectEntity();
		entity.setTypeName(dto.getTypeName());
		return entity;
	}
	
	public TypeProjectDTO toDTO (TypeProjectEntity entity) {
		TypeProjectDTO dto = new TypeProjectDTO();
		dto.setId(entity.getId());
		dto.setProjectEntities(entity.getProjectEntities());
		dto.setTypeName(entity.getTypeName());
		return dto;
	}
}
