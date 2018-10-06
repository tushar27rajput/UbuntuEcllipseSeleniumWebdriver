package com.WhileLoop;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) 
	{
		//GET number from keyboard
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int x = sc.nextInt();
		int y =0;
		while(x>0)
		{
			int d = x%10;
			y = y*10+d;
			x =(int)x/10;
		}
		System.out.println(y);

	}

}
