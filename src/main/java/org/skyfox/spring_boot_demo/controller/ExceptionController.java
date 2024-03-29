package org.skyfox.spring_boot_demo.controller;

import org.apache.shiro.authc.AccountException;
import org.skyfox.spring_boot_demo.entity.ResultMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionController {
	  private final ResultMap resultMap;

	    @Autowired
	    public ExceptionController(ResultMap resultMap) {
	        this.resultMap = resultMap;
	    }

	    /**
	     * 捕捉 CustomRealm 抛出的异常
	     */
	    @ExceptionHandler(AccountException.class)
	    public ResultMap handleShiroException(Exception ex) {
	        return resultMap.fail().message(ex.getMessage());
	}
}
