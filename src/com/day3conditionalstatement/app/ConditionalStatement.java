package com.day3conditionalstatement.app;

import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args) {
		//Variable Declaration
		int number = 0;
		char answer = 'y';
		//Object Declaration 
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input a number: ");
		number = input.nextInt();
		//do {
				if (number%2==1)
				{
					System.out.println("Weird");
				}
				else if(number%2==0 && number>=2 && number<=5)
				{
					System.out.println("Not Weird");
				}
				else if(number%2==0 && number>=6 && number<=20)
				{
					System.out.println("Weird");
				}
				else if(number%2==0 && number>20)
				{
					System.out.println("Not Weird");
				}
				//System.out.println("You wish to input another number (y/n): ");
				//answer = input.next
			//}while(answer == 'n');

	}

}
