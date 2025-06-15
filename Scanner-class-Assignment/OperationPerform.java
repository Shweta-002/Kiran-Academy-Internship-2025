package com.april8th;
import java.util.*;

public class OperationPerform {
	
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Enter first number: ");
		 int num1=sc.nextInt();
		 System.out.print("Enter second number: ");
		 int num2=sc.nextInt();
		 
		 System.out.println("------ Choose operation from given list ------");
		 System.out.println("1. Addition");
		 System.out.println("2. Subtraction");
		 System.out.println("3. Multiplication");
		 System.out.println("4. Division");
		 int num=sc.nextInt();
		 
		 System.out.println("------- Result is -------");
		 System.out.println();
		 
		 Operations o=new Operations(num1, num2);
		 o.calculate(num);
	}

}
