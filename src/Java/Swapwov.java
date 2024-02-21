package Java;

import java.util.Scanner;

public class Swapwov {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("The real number are");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("The Swapping number are");
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);
		System.out.println(b);
		
	}

}
