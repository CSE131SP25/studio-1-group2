package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("What is the year?");
		int s0 = in.nextInt();
		int s1 = s0%4;
		int s2 = s0%100;
		int s3 = s0%400;
		boolean s4 = s1 == 0 && s2 != 0 || s3 == 0;
		System.out.println (s4);
	}

}
