package zadaci_08_03_2017;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * (Sort ArrayList) Write the following method that sorts an ArrayList of
 * numbers: public static void sort(ArrayList<Integer> list) Write a test
 * program that prompts the user to enter 5 numbers, stores them in an array
 * list, and displays them in increasing order.
 */

public class SortList {

	/**
	 * method which sort list in ascending order
	 * @param list
	 */
	public static void sort(ArrayList<Integer> list){

		Collections.sort(list);
		
		
		printSortedLIst(list);

	}
	
	/**
	 * method which print sorted list
	 * @param list
	 */
	public static void printSortedLIst(ArrayList<Integer> list){
		
		System.out.println("\nList: ");
		for (Integer n : list) {
			System.out.print(n + " ");
		}
		
	}

	public static void main(String[] args) {
		//Test
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		int number;
		
		try {
			for (int i = 0; i < 5; i++) {
				System.out.print("Enter number: ");
				number = input.nextInt();
				list.add(number);
			}
			
			sort(list);
			
			
		} catch (Exception e) {
			System.out.println("Wrong input!!!");
		}
		
		input.close();

	}

}
