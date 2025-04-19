package forloop;
import java.util.*;

public class Factorial {
	public static void main(String arg[]) {
		
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		num = sc.nextInt();
		int fact =1;
		
		for(int i=1; i<=num; i++) {
			fact = fact*i;
		}
		System.out.println("Factorial of the: " + num + " is: " + fact);
	}

}
