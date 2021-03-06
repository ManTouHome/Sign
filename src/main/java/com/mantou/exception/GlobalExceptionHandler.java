package com.mantou.exception;

import com.mantou.entity.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 全局异常处理器
 */
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    /**
     * 处理Exceptionn异常
     * @param e
     * @return Response
     */
    @ExceptionHandler(Exception.class)
    public Response<String> handleException(Exception e) {
        print(e);
        String message = e.getMessage();
        if (null == message || "".equals(message)) {
            message = e.getClass().getSimpleName();
        }
        return Response.error(message);
    }

    private void print(Exception e) {
        log.error(" Exception : {}", e.getClass().getSimpleName(), e);
    }
}
