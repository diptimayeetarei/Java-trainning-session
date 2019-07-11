package javabasics;

public class TwoDimensionalArray {
	public static void main(String args[])
	{
		String s[][]=new String[5][7];
		s[0][0]="HI";
		s[0][1]="HI";
		s[0][2]="HI";
		s[1][0]="HI";
		System.out.println(s[0][0]);
		for (int row=0;row < s.length;row++)
		{
			for(int col=0;col<s.length;col++)
			{
				System.out.println(s[row][col]);
			}
		}
	
	}

}
