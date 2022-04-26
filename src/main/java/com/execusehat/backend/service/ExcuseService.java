package com.execusehat.backend.service;

import com.execusehat.backend.model.dto.Excuse;
import com.execusehat.backend.model.dto.ExcuseDTO;
import com.execusehat.backend.model.entity.ExcuseEntity;
import com.execusehat.backend.repository.ExcuseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class ExcuseService {

	private final ExcuseRepository excuseRepository;

	public List<ExcuseDTO> getAllExcuse() {
		return excuseRepository.findAll().stream().map(
				excuse -> ExcuseDTO.builder()
						.id(excuse.getId())
						.name(excuse.getName())
						.excuse(excuse.getExcuse())
						.build())
				.collect(Collectors.toList());
	}

	public void deleteExcuse(long id) {
		excuseRepository.deleteById(id);
	}

	@Transactional
	public void saveExcuse(Excuse excuse) {
		ExcuseEntity entity = new ExcuseEntity();
		entity.setName(excuse.getName());
		entity.setExcuse(excuse.getExcuse());
		excuseRepository.save(entity);
	}
}
