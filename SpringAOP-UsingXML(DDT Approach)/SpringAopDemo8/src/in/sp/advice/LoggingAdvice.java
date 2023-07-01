
package in.sp.advice;

import org.springframework.aop.ThrowsAdvice;

public class LoggingAdvice implements ThrowsAdvice
{
    public void afterThrowing(Exception e)
    {
        System.out.println("======== logging service logic ========");
    }
}
