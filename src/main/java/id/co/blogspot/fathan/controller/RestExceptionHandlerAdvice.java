package id.co.blogspot.fathan.controller;

import id.co.blogspot.fathan.dto.BaseResponse;
import id.co.blogspot.fathan.util.Credential;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Created by 4than.mustaqiim on 3/5/2017.
 */
@RestControllerAdvice(annotations = RestController.class)
public class RestExceptionHandlerAdvice {

  @ExceptionHandler(value = Exception.class)
  public BaseResponse exceptionHandler(Exception e) throws Exception {
    return new BaseResponse(e.getMessage(), null, false, Credential.getRequestId());
  }
}
