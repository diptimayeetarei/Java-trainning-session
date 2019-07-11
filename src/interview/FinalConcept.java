package interview;

public class FinalConcept {
	public static void main(String args[])
	{
		int i=10;
		i=20;
		i=30;
		System.out.println(i);//see here we can change the value of i but if we put final keyword before any var then it will count as constant and we can not change it forther
		final int j=90;
		//j=100;error as it declared as final
		System.out.println(j);
	}
//another is to prevent inheritance then we have to declared that class as final
	//to prevent overriding method we have to write as final before method
	/*
	 * public class final a {
	public static void main(String args[])
	{
	
	}
	public final void  add()
	{
	}
	}
	
	public class b extends a //it will show error because parent class declared as final
	{
		public void add() //it will show error because in parent class method it declared as final so no overriding
		
	{
	}
	}
	
	 */
}
