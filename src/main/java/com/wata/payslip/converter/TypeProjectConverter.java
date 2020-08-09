package com.wata.payslip.converter;

import java.util.ArrayList;
import java.util.List;

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
	
	public ArrayList<TypeProjectDTO> toDTOs(List<TypeProjectEntity> entitys) {
		ArrayList<TypeProjectDTO> dtos = new ArrayList<TypeProjectDTO>();
		for (TypeProjectEntity typeProjectEntity : entitys) {
			TypeProjectDTO dto = new TypeProjectDTO();
			dto = this.toDTO(typeProjectEntity);
			dtos.add(dto);
		}
		return dtos;
    }
}
