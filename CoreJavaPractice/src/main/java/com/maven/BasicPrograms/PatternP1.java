package com.maven.BasicPrograms;
import java.util.Scanner;
public class PatternP1 {
	public static void main(String args[])
	{
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter n value");
		int n = s.nextInt();
		for(int i = 1; i <= n; i++)
		{
			for(int j = 0; j < n-i; j++)
			{
				System.out.print(" ");
			}
			for(int j = 0; j < i+(i-1); j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
