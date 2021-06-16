package com.dwfinancas.programa.resources.exceptions;

import java.time.Instant;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.dwfinancas.programa.services.exceptions.DatabaseException;
import com.dwfinancas.programa.services.exceptions.ResourceNotFoundException;

//isso ira interceptar a exções que acontecer para que esse objeto possa executar um 
//possivel tratamento
@ControllerAdvice
public class ResourceExceptionHandler {
	
	//anotação para que faça a captação do erro e volte para esse metodo... 
	//metodo para tratamentoo do erro relacionado a codigo inexistente para deletar 
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<StandardError> resourceNotFound(ResourceNotFoundException e, HttpServletRequest request){
		String error = "Resource not found";
		HttpStatus status = HttpStatus.NOT_FOUND;
		StandardError err = new StandardError(Instant.now(), status.value(), error, e.getMessage(), request.getRequestURI());
		return ResponseEntity.status(status).body(err);
		
	}
	
	//exceção para erro relacionado a codigo contendo pedido para deletar
	@ExceptionHandler(DatabaseException.class)
	public ResponseEntity<StandardError> database(DatabaseException e, HttpServletRequest request){
		String error = "Database error";
		HttpStatus status = HttpStatus.BAD_REQUEST;		
		StandardError err = new StandardError(Instant.now(), status.value(), error, e.getMessage(), request.getRequestURI());
		return ResponseEntity.status(status).body(err);
		
	}
}