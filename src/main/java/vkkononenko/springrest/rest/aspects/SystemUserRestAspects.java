package vkkononenko.springrest.rest.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import java.util.Arrays;
import java.util.Objects;
import java.util.logging.Logger;

@Aspect
@Component
public class SystemUserRestAspects {

    @Pointcut("execution(public * vkkononenko.springrest.rest.SystemUserRest.getSystemUser(..))")
    public void Calling() {}

    @After("Calling()")
    public void Aspect(JoinPoint jp) {
        Logger logger = Logger.getLogger(SystemUserRestAspects.class.getName());
        Arrays.asList(jp.getArgs()).forEach(s -> logger.info(Objects.toString(s)));
    }
}
