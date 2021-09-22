package com.rest.webservice.restfulservices.user;

import java.util.Date;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@RestController
public class CustomExceptionHandler extends ResponseEntityExceptionHandler {
	@ExceptionHandler(Exception.class)
	public final ResponseEntity<Object> handleAllException(Exception ex, WebRequest request)
	{
		ExceptionMessage exe=new ExceptionMessage(new Date(),"User ID is not present in system", request.getDescription(false));
		return  new ResponseEntity<Object>(exe,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	@ExceptionHandler(UserNotFoundException.class)
	public final ResponseEntity<Object> handleUserNotFoundException(Exception ex, WebRequest request)
	{
		ExceptionMessage exe=new ExceptionMessage(new Date(),"User ID is not present in system", request.getDescription(false));
		return  new ResponseEntity<Object>(exe,HttpStatus.NOT_FOUND);
	}
	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(
			MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
         ExceptionMessage exe=new ExceptionMessage(new Date(), "Validation failed ", request.getDescription(false));
		return new ResponseEntity<Object>(exe,HttpStatus.BAD_REQUEST);
	}
	
	
}
