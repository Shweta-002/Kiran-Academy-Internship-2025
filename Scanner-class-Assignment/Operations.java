package com.april8th;

public class Operations {
	
	int num1;
	int num2;
	
	public Operations(int num1,int num2) {
		
		this.num1=num1;
		this.num2=num2;
	}
	
	public void calculate(int num) {
		
		if(num==1) {
			int a=num1+num2;
			System.out.println("Addition is: " + a);
		}else if(num==2) {
			int b=num1-num2;
			System.out.println("Subtraction is: " + b);
		}else if(num==3) {
			int c=num1*num2;
			System.out.println("Multiplication is: " + c);
		}else if(num==4) {
			double d=num1/num2;
			System.out.println("Division is: " + d);
		}else {
			System.out.println("Choose right option");
		}
	}

}
