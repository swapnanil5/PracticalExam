package learning2;
//author: Swapnanil Saha
import java.util.Scanner;

//Write a program to Menu driven program using switch statement 
//( Find addition, subtraction, multiplication and division 
//of to integer numbers )

public class Test2 {

	public static void main(String[] args) {
		//creating Scanner class object
		Scanner s = new Scanner(System.in);
		
		int ch;
		int num1, num2;
		//running the dasboard
		while (true) {
			
			//user will select 
			System.out.println("1. addition");
			System.out.println("2. subtraction");
			System.out.println("3. multiplication");
			System.out.println("4. division");
			
			System.out.println("enter your choice: ");
			
			ch = s.nextInt();
			
			//running the nessesary operation
			switch (ch) {
			//additon
			case 1:
				System.out.println("enter first No.: ");
				num1 = s.nextInt();
				System.out.println("enter second No.: ");
				num2 = s.nextInt();

				System.out.println("addtion of two numbers is: " + (num1 + num2));
				break;
			
			//subtraction
			case 2:
				System.out.println("enter first No.: ");
				num1 = s.nextInt();
				System.out.println("enter second No.: ");
				num2 = s.nextInt();

				System.out.println("subtraction of two numbers is: " + (num1 - num2));
				break;
			
			//multiplication
			case 3:
				System.out.println("enter first No.: ");
				num1 = s.nextInt();
				System.out.println("enter second No.: ");
				num2 = s.nextInt();
				System.out.println("multiplication of two numbers is: " + (num1 + num2));
				break;
			
			//division
			case 4:
				System.out.println("enter first No.: ");
				num1 = s.nextInt();
				System.out.println("enter second No.: ");
				num2 = s.nextInt();
				System.out.println("division of two numbers is: " + (num1 + num2));
				break;
			
				
			}
		}

	}

}
