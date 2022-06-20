package com.execusehat.backend.model.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class StatusDTO {

	private final int status;
	private final String message;

}
