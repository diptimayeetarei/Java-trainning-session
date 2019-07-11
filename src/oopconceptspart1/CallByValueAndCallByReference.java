package oopconceptspart1;

public class CallByValueAndCallByReference {
	//for call by reference create global variable
	int abc;
	int bcd;
	public static void main(String args[])
	{
		//to call call by value function we have to create object of the class
		CallByValueAndCallByReference obj=new CallByValueAndCallByReference();
		int x=10;
		int y=50;
		int z=obj.callByValue(x, y);//here what happens we call that function and it returns result after that it stores in z
		System.out.println(z);
		//to access global variable we have to access by objects
		obj.abc=80;
		obj.bcd=100;
		System.out.println(obj.abc);
		System.out.println(obj.bcd);
	}
	public int callByValue(int a,int b)
	{
		int c =a+b;
		return c;
		
	}
	public void callByReference(CallByValueAndCallByReference t)
	{
		//then how to use abc and bcd here
		//write for swap a program
		int temp=t.abc;
		t.abc=t.bcd;
		t.bcd=temp;
	
		
	}

}
