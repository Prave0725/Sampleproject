package Java;

import java.util.Scanner;

public class Biggestnumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("The four numbers are");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		if(a>b && a>c && a>d) {
			System.out.println("The biggest number is =" +a);
		}
		else if(b>c && b>d) {
			System.out.println("The biggest number is =" +b);
		}
		else if(c>d) {
			System.out.println("The biggest number is=" +c);
		}
		else {
			System.out.println("The biggest number is=" +d);
		}
	}

}
