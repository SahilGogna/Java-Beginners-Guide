package mymac;

import java.util.Scanner; // class to get command line input

/**
 * Classwork 1 Switch statements
 * 
 * @author sahilgogna
 *
 */
public class WhileLoop {
	
	/**
	 * Using while loop
	 * @author sahilgogna 1832114
	 *
	 */
	public static void main(String[] args) {
		
		System.out.println("Please enter a value between 1 to 12 and 0 to exit");
		int input; // variable to store user input 
		Scanner scan = new Scanner(System.in); // scanner class object to get input
		input = scan.nextInt(); // command line input stored in varibale
		while(input!=0) {
			switch (input) { // swich case on value of input variable
			case 1:
				System.out.println("January");
				break;

			case 2:
				System.out.println("February");
				break;

			case 3:
				System.out.println("March");
				break;

			case 4:
				System.out.println("April");
				break;

			case 5:
				System.out.println("May");
				break;

			case 6:
				System.out.println("June");
				break;

			case 7:
				System.out.println("July");
				break;

			case 8:
				System.out.println("August");
				break;

			case 9:
				System.out.println("September");
				break;

			case 10:
				System.out.println("October");
				break;

			case 11:
				System.out.println("November");
				break;

			case 12:
				System.out.println("December");
				break;

			default:
				System.out.println("Wrong value. Enter a number between 1 to 12");
				break;
			}// end of switch
			System.out.println("Please enter a value between 1 to 12 and 0 to exit");
			input = scan.nextInt();
		} // end of while
		scan.close();
	}
}
