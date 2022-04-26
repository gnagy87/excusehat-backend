package com.execusehat.backend.controller;

import com.execusehat.backend.model.dto.Excuse;
import com.execusehat.backend.model.dto.ExcuseDTO;
import com.execusehat.backend.service.ExcuseService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/excuse")
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class ExcuseController {

	private final ExcuseService excuseService;

	@GetMapping(path = "/all")
	public List<ExcuseDTO> getAllExcuses() {
		return excuseService.getAllExcuse();
	}

	@PostMapping(path = "/save")
	public ResponseEntity<Excuse> saveExcuse(@RequestBody Excuse excuse) {
		excuseService.saveExcuse(excuse);
		return ResponseEntity.ok(excuse);
	}

	@DeleteMapping(path = "/delete")
	public ResponseEntity<?> deleteExcuse(@RequestParam long id) {
		excuseService.deleteExcuse(id);
		return ResponseEntity.status(HttpStatus.OK).build();
	}
}
