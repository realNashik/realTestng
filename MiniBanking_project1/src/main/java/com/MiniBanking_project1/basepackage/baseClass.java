package com.MiniBanking_project1.basepackage;

import java.util.Scanner;

public class baseClass {

	public static void main(String[] args) {

//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter a number");
//		int num = scan.nextInt();
//		int rev = 0;
//		while (num != 0) {
//			rev = rev * 10 + num % 10;
//			num = num / 10;
//		}

		//System.out.println(rev);
	Scanner scan =new Scanner(System.in);
	int a =scan.nextInt();
	
	int b= scan.nextInt();
	if (a>b) {
		
		System.out.println(a +"is greater than"+b);}
		
		else if(b>a){
			System.out.println(b+"is greater than "+a);
		}
	
	
	}
	
}



	
	
	
	


