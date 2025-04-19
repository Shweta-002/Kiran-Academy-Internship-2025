package forloop;
import java.util.*;

public class MultiplicationTable {
	public static void main(String arg[]) {
		
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		num = sc.nextInt();
		
		for(int i=1; i<=10; i++) {
			System.out.println(num*i);
		}
	}

}
