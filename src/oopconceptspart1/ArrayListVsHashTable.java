package oopconceptspart1;

import java.util.ArrayList;

public class ArrayListVsHashTable {
public static void main(String args[])
{
	ArrayList ar=new ArrayList();
	ar.add(55);//0
	ar.add(57);//1
	ar.add(90);//2
	System.out.println(ar.size());
	ar.add(57);//3
	ar.add(90);//4
	System.out.println(ar.size());
	//its dynamic when we add the value the size is automatically increased but in Array concept first we have to define the size after that we can add
	
	ar.add("tom");//5
	ar.add(5.7f);
	ar.add('j');
	ar.add(56789);
	System.out.println(ar.size());
	ar.remove(0);//it will remove 0 index value
	//we can add any type of data type
	//it stores value at basis of indexes
	System.out.println(ar.get(5));//to check what is there in 5th index
	
	//to print all the values of array list
	//for loop
	for(int i=0;i<ar.size();i++)
	{
		System.out.println(ar.get(i));

	}
	//if we want to restrict the array list like only this array list should save integer value
	ArrayList<Integer> art = new ArrayList<Integer>();
	art.add(8);
	//ar1.add("78");//coz we can not add String here as we have ressticted
	ArrayList<String> arvar= new ArrayList<String>();
	arvar.add("honey");
	
	
}
}
