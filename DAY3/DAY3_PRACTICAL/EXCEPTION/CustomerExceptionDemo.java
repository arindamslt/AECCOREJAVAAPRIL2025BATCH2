package EXCEPTION;
class Account
{
	String acc="100";
	public void checkAccountno(String acc)
	{
		try
		{
		if(this.acc.equals(acc))
		{
			System.out.println("ACCOUNT EXISTS");
		}
		else
		{
			AccountNotFoundException ae=new AccountNotFoundException();
			throw ae;
		}
		}
		catch(AccountNotFoundException ae)
		{
			ae.printStackTrace();
			//System.out.println(ae.getMessage());
		}
	}
}
public class CustomerExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Account acn=new Account();
acn.checkAccountno("100");
	}

}
