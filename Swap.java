package Pack1;

import java.util.Scanner;

public class Swap

{
	int a,b,temp;
	
	void input()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value of A & B");
		a=s.nextInt();
		b=s.nextInt();
		System.out.println("\nYou entered,\n A="+a+"\n B="+b);
		s.close();
	}
	
	void swapping()
	{
		temp=a;
		a=b;
		b=temp;
		System.out.println("After swapping\n"+ "A = "+a+"\nB ="+b);
		
	}
	public static void main(String[] args)
	
	{
		Swap sw= new Swap();
		sw.input();
		sw.swapping();
	}

}
