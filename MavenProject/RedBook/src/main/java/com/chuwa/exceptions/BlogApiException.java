package com.chuwa.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class BlogApiException extends RuntimeException{
	private HttpStatus httpStatus;
	private String message;

	public BlogApiException(HttpStatus httpStatus, String message) {
		this.httpStatus = httpStatus;
		this.message = message;
	}

	public BlogApiException(String message, HttpStatus httpStatus, String message1) {
		super(message);
		this.httpStatus = httpStatus;
		this.message = message1;
	}

	public BlogApiException(String message, Throwable cause, HttpStatus httpStatus, String message1) {
		super(message, cause);
		this.httpStatus = httpStatus;
		this.message = message1;
	}

	public BlogApiException(Throwable cause, HttpStatus httpStatus, String message) {
		super(cause);
		this.httpStatus = httpStatus;
		this.message = message;
	}

	public BlogApiException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, HttpStatus httpStatus, String message1) {
		super(message, cause, enableSuppression, writableStackTrace);
		this.httpStatus = httpStatus;
		this.message = message1;
	}

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}

	@Override
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
