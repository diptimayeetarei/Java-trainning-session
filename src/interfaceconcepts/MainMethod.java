package interfaceconcepts;

public class MainMethod {
	public static void main(String args[])
	{
	//we can not create interface object but we can create hsbc obect
	Hsbcbank obj =new Hsbcbank();
	obj.credit();
	obj.debit();
	obj.total();
	obj.studentLoan();
	
	//dynamic polymorphisim
	//Child class object can be referred by parent interface reference variable
	UsBank obj1=new Hsbcbank();
	obj1.credit();
	obj1.debit();
	obj1.total();
	//obj1.studentloan()//it will show error because it is in child method only override methods can call
	//how to write min val which declared in us banl
	System.out.println(UsBank.min_val);
	//the min_val cannot be changed
	}

}
