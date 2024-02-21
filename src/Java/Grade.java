package Java;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the student marks");
		int n=sc.nextInt();
		System.out.println("Name of the student");
		String s=sc.next();
		switch(n/10)
		{
		case 9:
			System.out.println(s+ "Scored S grade" +n);
			break;
		case 8:
			System.out.println(s+ "Scored a grade" +n);
			break;
		case 7:
			System.out.println(s+ "Scored b grade" +n);
			break;
		case 6:
			System.out.println(s+ "Scored c grade" +n);
			break;
		case 5:
			System.out.println(s+ "Scored d grade" +n);
			break;
		case 4:
			System.out.println(s+ "Scored e grade" +n);
			break;
			default:
				System.out.println(s+ " get failed" +n);
				break;
		}
		
		
		

	}

}
