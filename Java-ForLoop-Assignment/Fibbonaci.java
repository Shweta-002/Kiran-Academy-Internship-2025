package forloop;
import java.util.*;

public class Fibbonaci {
	public static void main(String arg[]) {
		
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		num = sc.nextInt();
		int num1=0;
		int num2=1;
		int sum=0;
		System.out.print(num1 + " " + num2);
		
		
		for(int i=3; i<=num; i++) {
			
			sum = num1 + num2;
			System.out.print(" " + sum);
			num1=num2;
			num2=sum;
			
			
			
		}
		
	}

}
