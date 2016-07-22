package com.cooksys.model;

public class Response {
	private String code;
	private String message;
	private String content;
	private Object objectPassed;
	
	

	public Object getObjectPassed() {
		return objectPassed;
	}

	public void setObjectPassed(Object objectPassed) {
		this.objectPassed = objectPassed;
	}

	public Response(String code, String message, String content, Object objectPassed) {
		super();
		this.code = code;
		this.message = message;
		this.content = content;
		this.objectPassed = objectPassed;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Response [code=" + code + ", message=" + message + ", content=" + content + "]";
	}

	public Response(String code, String message, String content) {
		super();
		this.code = code;
		this.message = message;
		this.content = content;
	}

}
