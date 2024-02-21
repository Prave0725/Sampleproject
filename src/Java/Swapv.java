package Java;

import java.util.Scanner;

public class Swapv {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("The real numbers are");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("The sawpping numbers are");
		int c=a;
		a=b;
		b=c;
		System.out.println(a);
		System.out.println(b);
	}

}
