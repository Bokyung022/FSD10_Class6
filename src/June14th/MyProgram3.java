package June14th;

import java.util.Scanner;

public class MyProgram3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				
		int nl;
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter value for number of line between 1 to 15");
		nl = kb.nextInt();
		while(nl <1 || nl >15) {
			System.out.println("Not valid, please put it again");
			nl = kb.nextInt();
		}
		
		for (int i = 1 ; i <= nl; i++) {
			for (int j = 1 ; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
