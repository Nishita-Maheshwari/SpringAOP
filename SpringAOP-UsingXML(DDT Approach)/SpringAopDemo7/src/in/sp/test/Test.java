
package in.sp.test;

import in.sp.services.BankService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test
{
    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("/in/sp/resources/applicationContext.xml");
        
        BankService bankService = (BankService) context.getBean("proxyFactoryBean");
        bankService.transactionUsingUpi();
        System.out.println();
        bankService.mobileBankingTransaction();
    }
}
