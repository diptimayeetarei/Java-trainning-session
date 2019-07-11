package interfaceconcepts;

public class Hsbcbank implements UsBank,BrazilBank {
	//if a class is implementing any interface then it is compulsory to override all the methods of that interface
	public void credit()
	{
		System.out.println("credit method");
	}
	public void debit() {
		// TODO Auto-generated method stub
		System.out.println("debit method");
	}
	public void total()
	{
		System.out.println("total method");
	}
	//extra method we can write but Us bank method is mandatory as it implements from Us bank
	public void studentLoan()
	{
		System.out.println("student loan method");
	}
public void mute()
{
	
}
	
	

}
