package oopconceptspart1;

public class Functions {
	public static void main (String args[])
	{
		Functions obj=new  Functions();
		//one object created with reference obj
		//after creating the object the copy of all non static methods copy given to the object
		obj.accept();
		int z=obj.write();
		System.out.println(z);
		String v=obj.hon();
		System.out.println(v);
		int n=obj.divison(10, 5);
		System.out.println(n);
	}
	public void accept()
	{
		System.out.println("hi");
		//void does not return any value
		//no input  and no outpujt
	}
	public /*void*/int write()
	{
		int a=10;
		int b= 20;
		int c=a+b;
		//how to return
		return c;
	
		//no input  and some outpujt
	}
	public String hon()
	{
		String s="etyuk";
		return s;
		//no input  and some outpujt
	}
	public int divison(int var1, int var2)
	{
		//var1 and var2 are input arguments
		int d=var1/var2;
		return d;
		
	}

}
