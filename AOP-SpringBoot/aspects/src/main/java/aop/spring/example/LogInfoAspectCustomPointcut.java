package aop.spring.example;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(0)
public class LogInfoAspectCustomPointcut  {

	static Logger logger = LoggerFactory.getLogger(LogInfoAspectCustomPointcut.class);
	
	/// CUSTOM  POINTCUT////
	@Pointcut("execution(* aop.spring.example.controller.AOPExampleController.*(..))")
	public void methodsStarterServicePointcut() {
	}

	@Before("methodsStarterServicePointcut()")
	public void beforeMethods() throws Throwable {
		logger.info("/////// LogInfoAspectCustomPointcut - BEFORE POINTCUT /////");
	}

	@After("methodsStarterServicePointcut()")
	public void afterMethods() throws Throwable {
		logger.info("/////// LogInfoAspectCustomPointcut - AFTER POINTCUT /////");
	}
}
