package app;

import java.util.Scanner;

public class DriverApplication {
	
	
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter the total number of floors in the building: ");
			int floors = sc.nextInt();
			int[] x = new int[floors + 1];
			for(int i=1; i<floors+1; i++) {
				System.out.print("Enter the floor size on day " + i + ": ");
				int size = sc.nextInt();
				x[size] = i;
			}
			int j = floors;
			boolean flag;
			System.out.println("The order of construction is: ");
			
			for(int i=1; i<=floors; i++) {
				flag = false;
				System.out.println("Day " + i + ": ");
				while(j>=1 && x[j]<=i) {
					flag = true;
					System.out.print(j + " ");
					j--;
				}
				if(flag == true) {
					System.out.println();
				}
			}
		}
	}
}
