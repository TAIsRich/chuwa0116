package com.chuwa.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class RecordNotFoundException extends RuntimeException{
	private String resourceName;
	private String fieldName;
	private long fieldValue;

	public String getResourceName() {
		return resourceName;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public long getFieldValue() {
		return fieldValue;
	}

	public void setFieldValue(long fieldValue) {
		this.fieldValue = fieldValue;
	}

	public RecordNotFoundException(String resourceName, String fieldName, long fieldValue) {
		this.resourceName = resourceName;
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	}

	public RecordNotFoundException(String message, String resourceName, String fieldName, long fieldValue) {
		super(message);
		this.resourceName = resourceName;
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	}

	public RecordNotFoundException(String message, Throwable cause, String resourceName, String fieldName, long fieldValue) {
		super(message, cause);
		this.resourceName = resourceName;
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	}

	public RecordNotFoundException(Throwable cause, String resourceName, String fieldName, long fieldValue) {
		super(cause);
		this.resourceName = resourceName;
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	}

	public RecordNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, String resourceName, String fieldName, long fieldValue) {
		super(message, cause, enableSuppression, writableStackTrace);
		this.resourceName = resourceName;
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	}
}
