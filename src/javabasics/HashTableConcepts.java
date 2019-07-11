package javabasics;

import java.util.Hashtable;

public class HashTableConcepts {
	public static void main(String args[])
	{
		Hashtable h = new Hashtable();
		//h.put(key, value)
		h.put("A", "Test");
		h.put("B", "Hello");
		h.put("c", "Hi");
		System.out.println(h.size());
		h.put(100, "Test");
		h.put(200, "Hello");
		h.put(300, "Hi");
		System.out.println(h.size());
		System.out.println(h.get(200));//hello if we will give index then it will show NULL
		//Here we have to give restictions 
		Hashtable<Integer, String> h1= new Hashtable<Integer, String>();
		h1.put(100, "Twinkle");
		h1.put(200, "Tarei");
		h1.put(300, "Twinkle");
		h1.put(400, "Tarei");
		h1.put(500, "Twinkle");
		h1.put(600, "Tarei");
		h1.put(700, "Twinkle");
		h1.put(800, "Tarei");
		System.out.println(h1.get(100));
		
		//to print total hash table
		for(int i1=0; i1<h1.size();i1++)
		{
			System.out.println(h1.get(i1));
		}
		
	}

}
