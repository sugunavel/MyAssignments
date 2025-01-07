package homeassignments;

import java.util.Scanner;

public class CheckNumberIsPositive {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter a number : "); 
	int num=scan.nextInt();
	if (num>=1) {
		System.out.println(num + "  is positive number");
	}
	
	else if (num<0){
		System.out.println(num + "  is negative number");
	}
	
	else {
		System.out.println("The number is zero");
	}
	
}
}
