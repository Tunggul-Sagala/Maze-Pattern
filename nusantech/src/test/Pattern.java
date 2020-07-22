package test;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);
		System.out.print("Input positive integer number : ");
		int n =scanner.nextInt();
		scanner.close();
		int s =4 * n - 1;
		int leftDoorPosition =2;
		int rightDoorPosition =s-1;
		boolean isLeft =true;
		
		for (int line=1; line<=s; line++) {
			for (int column=1; column<=s; column++) {
				if (line % 2 ==1 && column ==leftDoorPosition && isLeft) {
					System.out.print(" ");
					column++;
				}
				if (line % 2 ==1 && column ==rightDoorPosition && !isLeft) {
					System.out.print(" ");
					column++;
				}
				if (line % 2 ==0 && column>1 && column <=rightDoorPosition) {
					System.out.print(" ");
				}
				else {
					System.out.print("@");
				}
			}
			if (line % 2 ==1) {
				isLeft =!isLeft;
			}
			System.out.println();
		}
	}

}
