package oopconceptspart1;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverloading obj=new MethodOverloading();
		obj.add();
		obj.add();
		obj.add(10, 20);
		obj.add(5.7f);
	}
	//method overloading is same function name with different arguement in same class
	//you can not create a method inside method
	//same method name with same number of arguement list not allowed
	//We can overload main method
	
	public void add()
	{
		
	}
	public void add(int i)
	{
		
	}
	public void add(int i,int j)
	{
		
	}
	public void add(float i)
	{
		
	}

}
