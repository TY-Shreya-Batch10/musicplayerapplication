package com.tyss.musicplayerapplication.dto;

import lombok.Data;

@Data
public class ResponseDTO {
	private int statusCode;
	private String message;
	private Object data;
}
