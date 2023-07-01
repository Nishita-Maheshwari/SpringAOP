
package in.sp.services;

public class BankServiceImpl implements BankService
{
    @Override
    public void transactionUsingUpi() 
    {
        System.out.println("-------business logic for UPI transaction-------");
    }

    @Override
    public void mobileBankingTransaction() 
    {
        System.out.println("-------business logic for mobile banking-----------");
    }

    @Override
    public void internetBankingTransaction() 
    {
        System.out.println("---------business logic for internet banking----------");
    }
}
