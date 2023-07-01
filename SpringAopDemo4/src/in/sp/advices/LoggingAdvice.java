
package in.sp.advices;

import java.lang.reflect.Method;
import org.springframework.aop.MethodBeforeAdvice;

public class LoggingAdvice implements MethodBeforeAdvice
{
    @Override
    public void before(Method method, Object[] os, Object o) throws Throwable 
    {
        System.out.println("======== service logic for logging =======");
    }
}
