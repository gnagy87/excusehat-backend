package com.execusehat.backend.model.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class ExcuseResult {

	private final List<ExcuseDTO> excuses;

}
