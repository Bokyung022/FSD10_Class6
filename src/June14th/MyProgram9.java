package June14th;

import java.util.Scanner;

public class MyProgram9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// this program asks user 6 times 2 val
		// and give the result of div first val by second val
		
		final int LIMIT = 6;
		int count = 0;
		double val1, val2;
		
		Scanner kb = new Scanner(System.in);
		System.out.println("You will be allowed 6 times to enter");
		System.out.println("you can enter -1 -1 at anytime to stop");
		System.out.println();
		
		while(count < LIMIT) {
			count++;
			System.out.println("This is division # " + count + ": ");
			System.out.println("Please enter the numbers");
			val1 = kb.nextDouble();
			val2 = kb.nextDouble();
			
			if(val1 == -1 && val2 == -1) {
				break;
			}
			if(val2 == 0) {
				System.out.println("You can't do this, you lost one attempt");
				continue;
			}
			
			System.out.println("Division # " + count + " Result is " + val1/val2);
			System.out.println();
		}
		System.out.println("Thank you, you done");
		kb.close();
	}

}
