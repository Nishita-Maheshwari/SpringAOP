
package in.sp.test;

import in.sp.services.BankService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test
{
    public static void main(String[] args)
    {
        try
        {
            ApplicationContext context = new ClassPathXmlApplicationContext("/in/sp/resources/applicationContext.xml");
        
            BankService bankService = (BankService) context.getBean("proxyFactoryBean");
            bankService.transactionUsingUpi();
            System.out.println();
            bankService.mobileBankingTransaction();
        }
        catch(Exception e)
        {
            //System.out.println(e);
        }
    }
}
