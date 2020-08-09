package com.wata.payslip.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.wata.payslip.converter.TypeProjectConverter;
import com.wata.payslip.model.DTO.SearchData;
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
	public ResponseEntity<Map<String, Object>> createTypePreject(TypeProjectDTO typeProjectDTO) {
		TypeProjectEntity entity = typeProjectConverter.toEntity(typeProjectDTO);
		try {
			entity = iTypeProjectRepository.save(entity);
			Map<String, Object> response = new HashMap<>();
			response.put("typeProject", typeProjectConverter.toDTO(entity));
			return new ResponseEntity<>(response, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@Override
	public ResponseEntity<Map<String, Object>> getAllTypeProject() {
		try {
			ArrayList<TypeProjectDTO> dtos = typeProjectConverter.toDTOs(iTypeProjectRepository.findAll());
			Map<String, Object> response = new HashMap<>();
			response.put("typeProjects", dtos);
			return new ResponseEntity<>(response, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@Override
	public ResponseEntity<Map<String, Object>> getTypeProjectById(Integer id) {
		try {
			TypeProjectEntity entity = iTypeProjectRepository.findOneById(id);
			Map<String, Object> response = new HashMap<>();
			response.put("typeProjects", typeProjectConverter.toDTO(entity));
			return new ResponseEntity<>(response, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@Override
	public ResponseEntity<Map<String, Object>> deleteTypeProjectById(Integer id) {
		try {
			iTypeProjectRepository.deleteById(id);
			return new ResponseEntity<>(null, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@Override
	public ResponseEntity<Map<String, Object>> updateTypeProjectById(TypeProjectDTO typeProjectDTO, Integer id) {
		try {
			TypeProjectEntity entity = iTypeProjectRepository.findOneById(id);
			entity.setTypeName(typeProjectDTO.getTypeName());
			Map<String, Object> response = new HashMap<>();
			response.put("typeProject", typeProjectConverter.toDTO(iTypeProjectRepository.save(entity)));
			return new ResponseEntity<>(response, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@Override
	public ResponseEntity<Map<String, Object>> searchTypeByTypeName(SearchData searchData) {
		String typeName = searchData.getSearchValue();
		Integer currentPage, pageSize;
		String sort = searchData.getSort();

		if (searchData.getCurrentPage() != null) {
			currentPage = searchData.getCurrentPage();
		} else {
			currentPage = 0;
		}

		if (searchData.getPageSize() != null) {
			pageSize = searchData.getPageSize();
		} else {
			pageSize = 3;
		}
		
		try {
			List<TypeProjectEntity> typeProjectEntities = new ArrayList<TypeProjectEntity>();
			Pageable paging;

			if (sort != null) {
				switch (sort) {
				case "ASC":
					paging = PageRequest.of(currentPage, pageSize, Sort.by("typeName"));
					break;
				case "DESC":
					paging = PageRequest.of(currentPage, pageSize, Sort.by("typeName").descending());
					break;
				default:
					paging = PageRequest.of(currentPage, pageSize);
					break;
				}
			} else {
				paging = PageRequest.of(currentPage, pageSize);
			}

			Page<TypeProjectEntity> pageTuts;
			if (typeName == null) {
				pageTuts = iTypeProjectRepository.findAll(paging);
			} else {
				pageTuts = iTypeProjectRepository.findByTypeNameContaining(typeName.trim(), paging);
			}

			typeProjectEntities = pageTuts.getContent();
			
			if (typeProjectEntities.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			}

			Map<String, Object> response = new HashMap<>();
			response.put("currentPage", pageTuts.getNumber());
			response.put("totalItems", pageTuts.getTotalElements());
			response.put("totalPages", pageTuts.getTotalPages());
			response.put("employee", typeProjectConverter.toDTOs(typeProjectEntities));
			return new ResponseEntity<>(response, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
