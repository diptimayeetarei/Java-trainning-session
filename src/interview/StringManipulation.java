package interview;

public class StringManipulation {

	public static void main(String[] args) {
		String str="I love to dance in rain";
		String str1="do u love to dance in rain";
		System.out.println(str.length());//length of the string
		System.out.println(str.charAt(5));//5th index character it will show
		System.out.println(str.indexOf("d"));//it will show d is in which index
		//if there are different i then how you will validate
		System.out.println(str.indexOf("i", str.indexOf("s"+1)));
		System.out.println(str.indexOf("dance"));
		System.out.println(str.indexOf("kurki"));//-1
		System.out.println(str.equals(str1));//false coz it is case sensitice
		System.out.println(str.equalsIgnoreCase(str1));//it is not case sensitive
		//substring to get value only wothin 0-9
		System.out.println(str.substring(0,9));
		//trim method is user for before space and after space
		String str5="      hello    world                 ";
		System.out.println(str5.trim());
		//if you want to remove space between hello and world then you have to use
		System.out.println(str5.replace("", ""));
		String date="15-08-2017";
		System.out.println(date.replace("-", "/"));
		//split method
		String spli="Hello_world_test_selenium_course";
		String newval[]=spli.split("-");
		//coz after we split it will become 5 so we need to store in array
		for(int i=0;i<newval.length;i++)
		{
			System.out.println(newval[i]);
		}
		//to add any string
		String s1="gtylk";
		System.out.println(s1.concat("kikiikik"));
		String a="Honey";
		String z="kikiu";
		int a1=100;
		int n=500;
		System.out.println(a+a1+z+n);
		System.out.println(a1+n+a+z);
		
	}

}
