
package in.sp.advices;

import java.lang.reflect.Method;
import org.springframework.aop.MethodBeforeAdvice;

public class LoggingAdvice implements MethodBeforeAdvice
{
    @Override
    public void before(Method method, Object[] params, Object target) throws Throwable
    {
        System.out.println("====== logging service =======");
    }
}
