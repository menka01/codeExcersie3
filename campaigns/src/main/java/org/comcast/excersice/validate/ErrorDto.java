package org.comcast.excersice.validate;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement 
public class ErrorDto {
	String errorCode;
	 String errorMessage;
	 public ErrorDto()
	 {
		 
	 }
	 public ErrorDto(String eCode,String eMessage)
	 {
		 super();
		 errorCode= eCode;
		 errorMessage= eMessage;
	 }
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	
	
	

}
