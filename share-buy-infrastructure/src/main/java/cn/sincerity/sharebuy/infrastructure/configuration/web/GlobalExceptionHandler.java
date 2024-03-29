package cn.sincerity.sharebuy.infrastructure.configuration.web;

import cn.sincerity.sharebuy.infrastructure.http.CommonResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * GlobalExceptionHandler
 *
 * @author Ht7_Sincerity
 * @date 2023/4/12
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(value = Exception.class)
    public CommonResponse<?> exceptionHandler(Exception e) {
        return CommonResponse.failure(e.getMessage());
    }
}
