package com.validation.demo.exception;

public enum ErrorCode {

	INTERNAL_SERVER_ERROR(500), BAD_REQUEST(400), NOT_FOUND(404);
	private final int code;

	private ErrorCode(int code) {
		this.code = code;
	}

	public int getCode() {
		return this.code;
	}

}
