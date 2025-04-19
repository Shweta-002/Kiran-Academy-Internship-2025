package forloop;
import java.util.*;

public class NumberReverse {
	public static void main(String arg[]) {
		
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		num = sc.nextInt();
		
		for(int i=1; num!=0; i++) {
			int a = num%10;
			System.out.print(a);
			num = num/10;
		}
	}
	

}
