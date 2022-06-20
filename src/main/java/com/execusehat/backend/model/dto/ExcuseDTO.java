package com.execusehat.backend.model.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ExcuseDTO {

	private final long id;
	private final String title;
	private final String author;

}
