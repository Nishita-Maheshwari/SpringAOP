
package in.sp.services;

public class BankServiceImpl implements BankService
{
    @Override
    public void transactionUsingUpi() 
    {
        System.out.println("-------business logic for upi transaction------");
    }

    @Override
    public void mobileBankingTransaction() 
    {
        System.out.println("-------business logic for mobile banking-------");
    }
}
