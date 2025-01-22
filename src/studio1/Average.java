package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("What is the first integer?");
		int s0 = in.nextInt();
		System.out.print("What is the second integer?");
		int s1 = in.nextInt();
		double one = (s1 + s0) * 0.5;
		System.out.println ("The average of both integers is " + one);
	}

}
