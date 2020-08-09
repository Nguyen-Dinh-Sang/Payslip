package com.wata.payslip.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wata.payslip.converter.TypeProjectConverter;
import com.wata.payslip.model.DTO.TypeProjectDTO;
import com.wata.payslip.model.entity.TypeProjectEntity;
import com.wata.payslip.repository.ITypeProjectRepository;
import com.wata.payslip.service.ITypeProjectService;

@Service
public class TypeProjectService implements ITypeProjectService{
	
	@Autowired
	private ITypeProjectRepository iTypeProjectRepository;
	
	@Autowired
	private TypeProjectConverter typeProjectConverter;

	@Override
	public TypeProjectDTO createTypePreject(TypeProjectDTO typeProjectDTO) {
		TypeProjectEntity entity = typeProjectConverter.toEntity(typeProjectDTO);
		entity = iTypeProjectRepository.save(entity);
		return typeProjectConverter.toDTO(entity);
	}

}
