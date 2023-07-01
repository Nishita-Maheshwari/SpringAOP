
package in.sp.advice;

import java.lang.reflect.Method;
import org.springframework.aop.AfterReturningAdvice;

public class LoggingAdvice implements AfterReturningAdvice
{
    @Override
    public void afterReturning(Object o, Method method, Object[] os, Object o1) throws Throwable
    {
        System.out.println("======== logging service logic ========");
    }
}
