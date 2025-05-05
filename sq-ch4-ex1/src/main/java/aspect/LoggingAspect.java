package aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import services.Comment;

import java.util.Arrays;
import java.util.logging.Logger;

@Aspect
public class LoggingAspect {

    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @Around("execution(* services.*.*(..))")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        String methodName = joinPoint.getSignature().getName();     // Get the method name
        Object[] arguments = joinPoint.getArgs();   // Get the arguments of the method

        logger.info("Method "+ methodName +" with parameter "+ Arrays.asList(arguments)+ " will execute");

        Comment comment = new Comment();
        comment.setText("Here something going on");

        Object[] newArguments = {comment};

        Object returnedByMethod = joinPoint.proceed(newArguments);

        logger.info("Method executed and returned "+ returnedByMethod);

        return returnedByMethod;

    }
}
