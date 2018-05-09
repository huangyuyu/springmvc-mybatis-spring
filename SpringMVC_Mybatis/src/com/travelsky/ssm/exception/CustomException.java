package com.travelsky.ssm.exception;

/**自定义的异常类,针对预期的异常，需要在程序中抛出此类异常
 * @author huangyu
 *
 */
public class CustomException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5792374301507780517L;
	//异常信息
	private String message;

	public CustomException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
