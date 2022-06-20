package com.execusehat.backend.controller;

import com.execusehat.backend.model.dto.Excuse;
import com.execusehat.backend.model.dto.ExcuseResult;
import com.execusehat.backend.model.dto.StatusDTO;
import com.execusehat.backend.service.ExcuseService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/excuse")
@RequiredArgsConstructor(onConstructor_ = @Autowired)
@CrossOrigin("http://localhost:3000/")
public class ExcuseController {

	private final ExcuseService excuseService;

	@GetMapping(path = "/all")
	public ExcuseResult getAllExcuses() {
		return excuseService.getAllExcuse();
	}

	@PostMapping(path = "/save")
	public ResponseEntity<StatusDTO> saveExcuse(@RequestBody Excuse excuse) {
		excuseService.saveExcuse(excuse);
		return ResponseEntity.ok(StatusDTO.builder()
				.status(200)
				.message("Successfully saved")
				.build());
	}

	@DeleteMapping(path = "/delete")
	public ResponseEntity<StatusDTO> deleteExcuse(@RequestParam long id) {
		excuseService.deleteExcuse(id);
		return ResponseEntity.ok(StatusDTO.builder()
				.status(200)
				.message("Successfully deleted")
				.build());
	}
}
