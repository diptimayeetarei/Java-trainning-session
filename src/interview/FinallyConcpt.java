package interview;

import javax.management.RuntimeErrorException;

public class FinallyConcpt {
	public static void main(String args[])
	{
		test1();
		//how to access test 2 method we have to create object
		test2();
		test3();
		test4();
		
	
	}
	public static void test1()
	{
		try{
			System.out.println("inside try");
			throw new RuntimeErrorException(null, "test");
			
		}catch(Exception e)
		{
			System.out.println("catch block");
		}
		finally{
			System.out.println("inside finally");
		}
	}
//Whatever we write in finally block it will execute after try catch block does not matter in try catch block exception is coming or not

public static void test2()
{
	try{
		System.out.println("inside try block");
	}
	finally{
		System.out.println("Inside finally block");
	}
	
	//here in try block there is no exception but finally block executed
	//Finally block will execute everytime no matter exception is there or not
	
}

public static void test3()
{
	try{
		int a=10/0;
		System.out.println("exception occured");
	}
	catch(ArithmeticException e)
	{
		System.out.println("arithmatic exception caught");
	}
	finally
	{
		System.out.println("no exception but finally block will print");
	}
}
public static void test4()
{
	try{
		int a=10/0;
		System.out.println("exception occured");
	}
	catch(RuntimeErrorException e)
	{
		System.out.println("arithmatic exception caught");
	}
	finally
	{
		System.out.println("exception but finally block will print");
	}
}
//above what happened in try block exception is there so in catch block it expects arithmatic exception but we have given run time exception so error exist but still finally block will run
//while retriving the data in database sometimes we got exception but if we will write close database statement within finally block then it will close the connection 
//driver.quit we can write

}
