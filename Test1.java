package learning2;

//author: Swapnanil Saha
import java.util.Scanner;

//Write a program to find the sum of even numbers between 25 to 51.
public class Test1 {

	public static void main(String[] args) {
		//creating Scanner class object
		Scanner s=new Scanner(System.in);
		
		
		int sum=0;
		//running the loop
		for (int i = 25; i <= 51; i++) {
			//cheak if i is even or not
			if (i%2==0) {
				//adding i to sum
				sum=sum+i;
			}
			
		}
		//printing the summation
		System.out.println("sum of even numbers between 25-51: "+sum);
	}

}
