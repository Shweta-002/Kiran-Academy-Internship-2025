package forloop;
import java.util.*;

public class Digits {
	public static void main(String arg[]) {
		
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		num = sc.nextInt();
		int sum = 0;
		
		if(num > 0) {
			
			for(int i=1; i<=num; i++) {
				
				int a = num%10;
				sum = sum + a;
				num = num/10;
			}
			System.out.println(sum);
		}
		
		
	}

}
