package June14th;

import java.util.Scanner;

public class MyProgram5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		    for(int i = 0 ; i <= 100; i++) {
			if(i%2 == 0) {
				System.out.println(i);
			}
		}
		*/

		Scanner kb = new Scanner(System.in);
		System.out.println("Please give me positive num? ");
		int num = kb.nextInt();
		
		while (num < 0) {
			System.out.println("Wrong input please re enter : ");
			num = kb.nextInt();
		}
		
		int fact = 1;
		
		if(num == 0 ) {
			fact = 1;
		}
		
		for(int i = 1; i <= num ; i++ ) {
			fact = fact*i;
		}
		System.out.println("the factorial of "+ num + " is :"+ fact);
	}

}
