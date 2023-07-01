
package in.sp.services;

public class BankServiceImpl implements BankService
{
    @Override
    public void transactionUsingUpi()
    {
        System.out.println("-------business logic for upi transaction------");
    }

    @Override
    public void mobileBankingTransaction() throws Exception
    {
        System.out.println("-------business logic for mobile banking-------");
        throw new Exception("My exception...!!");
    }
}
