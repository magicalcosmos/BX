package com.bixin.bixin_activity.exception;

import com.bixin.bixin_activity.pojo.ResponseMessage;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.hibernate.type.descriptor.jdbc.internal.GetObjectExtractor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice  // 专门用于统一处理
public class GlobalExceptionHandlerAdvice {

    Logger log = LoggerFactory.getLogger(GetObjectExtractor.class);

    @ExceptionHandler({Exception.class}) // 什么异常的统一处理
    public ResponseMessage handlerException(Exception e, HttpServletRequest request, HttpServletResponse response) {
        // 记录日志
        log.error("统一异常：", e);
        return new ResponseMessage(500, "error", null);
    }
}
