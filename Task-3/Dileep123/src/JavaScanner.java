import java.util.Scanner;
//package oopconcepts;	

public class JavaScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		   
		  System.out.print("Input first number: ");
		  int num1 = in.nextInt();
		  //System.out.print("Input second number: ");
		  //int num2 = in.nextInt();
		  for (int i=1; i<=10; i++) { 
		  		System.out.println(num1 + " x " + i + " = " + num1 * i);
		  }
		  
		  //System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		  //System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
		  //System.out.println(num1 + " - " + num2 + " = " + (num1 / num2));
		  //System.out.println(num1 + " - " + num2 + " = " + (num1 % num2));
		  System.out.println("   J    a   v     v  a   ");
		  System.out.println("   J   a a   v   v  a a  ");
		  System.out.println("J  J  aaaaa   V V  aaaaa ");
		  System.out.println(" JJ  a     a   V  a     a");
		  
			double R=25.5;
			double M=3.5;
			double H=40.5;
			double J=4.5;
			double pi=4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));
			System.out.println((R*M-M*M)/(H-J));
			System.out.println(pi);
			//(R*M-M*M)/(H-J)
			//((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
			

		 }
	
		
}
