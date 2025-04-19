package forloop;
import java.util.*;

public class Sum {
	public static void main(String arg[]) {
		
		int a;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		a = sc.nextInt();
		
		for(int i=1; i<=a; i++) {
			sum = sum + i;
		}
		System.out.println("The sum of first " + a + " natural numbers is: " + sum);
		
		
	}

}
