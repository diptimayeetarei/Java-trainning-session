package javabasics;

public class ArrayConcept {
	public static void main(String args[])
	{
		//int array
		
		int i[]=new int[7];
		i[0]=10;
		i[1]=10;
		i[2]=10;
		i[3]=10;
		i[4]=10;
		i[5]=10;
		System.out.println(i.length);
		for(int j=0;j<i.length;j++)
		{
		System.out.println(j);
		}
		char ch[]=new char[5];
		Boolean b[]=new Boolean[8];
		String s[]=new String[5];
		Object obj[]=new Object[5];
		//Object array is used to store different type of variables
		obj[0]="1";
		obj[1]=12345;
		obj[2]=1.5f;
		obj[3]=true;
		
		
	}

}
