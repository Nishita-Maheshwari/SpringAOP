
package in.sp.test;

import in.sp.services.BankService;
import in.sp.services.GovtService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test
{
    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("/in/sp/resources/applicationContext.xml");
        
        BankService bankService = (BankService) context.getBean("proxyFactoryBean1");
        bankService.transactionUsingUpi();
        System.out.println();
        bankService.mobileBankingTransaction();
        System.out.println();
        bankService.internetBankingTransaction();
        System.out.println();
        bankService.walletTransaction();
        
        System.out.println("\n**************************************************************\n");
        
        GovtService govtService = (GovtService) context.getBean("proxyFactoryBean2");
        govtService.serviceOne();
        System.out.println();
        govtService.serviceTwo();
    }
}
