package ver1_1;

import java.util.InputMismatchException;
import java.util.Scanner;


 class TextSim_Display extends Calc_Core {


	private static Scanner scan;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	scan = new Scanner (System.in);
	
	
	double mass;
	byte yesOrNo;
	
	try {
	do {
		System.out.println("Would you like to run the program?");
		System.out.println("Enter 1 for Yes, and 2 for No.");
		
		
		yesOrNo = scan.nextByte();
		switch (yesOrNo) {		
		
		case 1:
		System.out.println("Enter mass of star below.");
		mass = scan.nextDouble();
		System.out.println();
		StarAttribute.SolSysCalculator(mass);
		break;
		
		case 2:
			System.out.println("Thank you for using me.");
		break;
		
		default:
		if (yesOrNo != 1 || yesOrNo != 2 ) {
			System.out.println("Please only input 1 or 2.");
				
					}		
				}
			
		}while (yesOrNo == 1);
	
		}catch(InputMismatchException error){
			System.out.println("Please limit input strictly to 1 and 2 only.");
		
		}finally {
			System.out.println("Sorry for the inconvenience.");
		}
		
	
	
		}
}