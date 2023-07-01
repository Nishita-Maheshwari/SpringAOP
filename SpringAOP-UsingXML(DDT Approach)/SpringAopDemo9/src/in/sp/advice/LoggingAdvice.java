
package in.sp.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LoggingAdvice implements MethodInterceptor
{
    @Override
    public Object invoke(MethodInvocation mi) throws Throwable
    {
        System.out.println("======== logging service logic (before) ========");
        Object obj = mi.proceed();
        System.out.println("======== logging service logic (after) ========");
        
        return obj;
    }
}
