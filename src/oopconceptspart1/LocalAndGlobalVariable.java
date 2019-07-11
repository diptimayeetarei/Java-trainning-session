package oopconceptspart1;

public class LocalAndGlobalVariable {
	//global variable
String s;
int a =10;
public static void main(String args[])
{
	//local
	int z=35;
	System.out.println(z);
	//to access global variable we must create object of the class
	LocalAndGlobalVariable obj=new LocalAndGlobalVariable();
	int result=obj.a;
	System.out.println(result);
	
}
public void accept()
{
	//local variable we can not use it outside from the function
	int d;
	
}
public void div()
{
	//local variable we can not use it outside from the function
	int z;
}
}
