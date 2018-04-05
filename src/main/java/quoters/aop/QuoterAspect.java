package quoters.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Aspect
@Component
public class QuoterAspect {


    @Pointcut("@annotation(Deprecated)")
    public void allDeprecated(){}


    @AfterThrowing(value = "execution(* quoters.dao..*.*(..))", throwing = "ex")
    public void handleDBExceptions(DBException ex) {
        System.out.println(ex);
    }


    @Around("allDeprecated()")
    public Object handleDeprecated(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("Чув это же устаревший метод!!!");
        Object retVal = pjp.proceed();
        System.out.println("Больше так не делай!!!");
        return retVal;

    }

    @Before("execution(* quoters..*.say*(..)))")
    public void handleSayMethods(JoinPoint jp) {
        System.out.print("This is quote of "+jp.getThis().getClass().getName()+" "+jp.getTarget().getClass().getName());
    }
}
