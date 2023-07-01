
package in.sp.services;

public class BankServiceImpl implements BankService
{
    @Override
    public void transactionUsingUpi()
    {
        System.out.println("----------business logic for upi transaction---------");
    }

    @Override
    public void mobileBankingTransaction() 
    {
        System.out.println("----------business logic for mobile banking transaction---------");
    }

    @Override
    public void internetBankingTransaction()
    {
        System.out.println("----------business logic for internet banking transaction---------");
    }

    @Override
    public void walletTransaction()
    {
        System.out.println("----------business logic for wallet transaction---------");
    }
}
