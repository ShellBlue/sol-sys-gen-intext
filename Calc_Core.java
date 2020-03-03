package ver1_2;
import java.util.Scanner;
import java.text.DecimalFormat;

	public class Calc_Core {

	private static DecimalFormat decForm;
	 static Scanner scan;


	static class StarAttribute {	
	
		
	static double RandomizerMethod(double minimum, double maximum) {
			
			decForm = new DecimalFormat ("##0.0000000");
			double a = minimum;
			double b = maximum;
			double result = 0;
			int counter = 0;
			
		do {
			//a way to pseudo-randomly generate decimals//
				result = (Math.random()*(1+((b-a)+a)));
			//the part below is to ensure the resulting decimal is in the range between input a and input b before proceeding with the loop//
				if (result >= a && result <=b) {
				counter ++;
					}	
				}while ( counter <= 50);
				
		return result;
		
	}
		
			
		static void SolSysCalculator (double mass) {
		
			decForm = new DecimalFormat ("##0.0000000");	
			
			double luminosity, diameter, surfaceTemperature; 
			double lifetime, innerGravityLimit, outerGravityLimit;
			double frostLine, habitableValue, innerH, outerH;
			double outerPlanD, innerPlanD;
			double obliquity;
			
			//rough equations for creating a solar system//
			luminosity = Math.pow(mass, 3);
			diameter = Math.pow(mass,0.74);
			surfaceTemperature = Math.pow(mass, 0.505);
			lifetime = Math.pow(mass, -2.5);
			innerGravityLimit = 0.1*mass;
			outerGravityLimit = 40*mass;
			frostLine = 4.85*(Math.pow(luminosity, 0.5));
			habitableValue = Math.pow(luminosity, 0.5);
			innerH = habitableValue*0.95;
			outerH = habitableValue*1.35;
			obliquity = RandomizerMethod(0,180);
		    	
			//to format result of equations to a more eye-pleasing form//
			String format1 = decForm.format(mass);
			String format2 = decForm.format(luminosity);
			String format3 = decForm.format(diameter);
			String format4 = decForm.format(surfaceTemperature);
			String format5 = decForm.format(lifetime);
			String format6 = decForm.format(innerGravityLimit);
			String format7 = decForm.format(outerGravityLimit);
			String format8 = decForm.format(frostLine);
			String format9 = decForm.format(innerH);
			String format10 = decForm.format(outerH);
			
			//to print out results//
			System.out.println("The star's complete attributes are: ");
			System.out.println();
			System.out.println("Mass is "+format1+" Sun");
			System.out.println();
			System.out.println("Luminosity "+format2+" Sun");
			System.out.println();
			System.out.println("Diameter is "+format3+" Sun");
			System.out.println();
			System.out.println("Surface Temperature is "+format4+" Sun");
			System.out.println();
			System.out.println("Lifetime is "+format5+" Sun");
			System.out.println();
			System.out.println("Inner Gravity Limit is "+format6+" AU");
			System.out.println();
			System.out.println("Outer Gravity Limit is "+format7+" AU");
			System.out.println();
			System.out.println("Frost Line starts at "+format8+" AU" );
			System.out.println();
			System.out.println("Habitable Zone Inner Limit is "+(format9)+" AU and Outer Limit is "+(format10)+" AU");
			System.out.println();
			
			
			//an array to hold the random decimals produced by the RandomizerMethod//
			double randomCoef = 0;
			double doubleHolder [][] = new double [10][10];
			randomCoef = RandomizerMethod(1.4,2.0);
			do { 
				
				
				for (int xAxis = 0; xAxis <doubleHolder.length; xAxis++) {
					for (int yAxis = 0; yAxis <doubleHolder.length - 1; yAxis++) {
				
						doubleHolder[xAxis][yAxis] = randomCoef;
						}
					}
		
				//this part pseudo-randomly create outer planets and assigning basic orbital properties to them//
				outerPlanD = (frostLine*randomCoef)-1;
				String formatA = decForm.format(outerPlanD);
				System.out.println("==========================================================");
				System.out.println();
				System.out.println("Outer Planet is "+formatA+" AU from the parent star.");
				obliquity = RandomizerMethod(0,180);
				String format03 = decForm.format(obliquity);
				System.out.println("This planet's obliquity is "+format03+" degrees");
				double eccentricity1 = RandomizerMethod(0.0068, 0.2488);
				String formatB = decForm.format(eccentricity1);
				System.out.println("Their eccentricity is "+formatB);
				double inclination1 = RandomizerMethod(0,17.142);
				String formatC = decForm.format(inclination1);
				System.out.println("Their inclination is "+formatC);
				System.out.println();
				
				
				//same description as the previous comment, but in a do-while loop//
				
				do { 
					for (int xAxis = 0; xAxis <doubleHolder.length; ++xAxis) {
					
						for (int yAxis = 0; yAxis <doubleHolder.length - 1; ++yAxis) {
						
							outerPlanD = outerPlanD*doubleHolder[xAxis][yAxis];	
								
							if (outerPlanD <= outerGravityLimit) {
									String formatD = decForm.format(outerPlanD);
									System.out.println("Outer Planet is "+formatD+" AU from the parent star.");
									obliquity = RandomizerMethod(0,180);
									String format04 = decForm.format(obliquity);
									System.out.println("This planet's obliquity is "+format04+" degrees");
									double eccentricity2 = RandomizerMethod(0.0068, 0.2488);
									String formatE = decForm.format(eccentricity2);
									System.out.println("Their eccentricity is "+formatE);
									double inclination2 = RandomizerMethod(0,17.142);
									String formatF = decForm.format(inclination2);
									System.out.println("Their inclination is "+formatF);
									System.out.println();
									
									
								}
							}
						}
					
				}while (outerPlanD <= outerGravityLimit);
				
				
				//this part pseudo-randomly creates inner planets and assign basic orbital properties to them//
				
				innerPlanD = (frostLine/randomCoef)+1;
				String formatG = decForm.format(innerPlanD);
				System.out.println("==========================================================");
				System.out.println();
				System.out.println("Inner Planet is "+formatG+" AU from the parent star.");
				obliquity = RandomizerMethod(0,180);
				String format05 = decForm.format(obliquity);
				System.out.println("This planet's obliquity is "+format05+" degrees");
				double eccentricity3 = RandomizerMethod(0.0068, 0.2488);
				String formatH = decForm.format(eccentricity3);
				System.out.println("Their eccentricity is "+formatH);
				double inclination3 = RandomizerMethod(0,17.142);
				String formatI = decForm.format(inclination3);
				System.out.println("Their inclination is "+formatI);
				System.out.println();	
				
				
				
	
					
				//same description as the previous comment, but in a do-while loop//
				
				do {
		
					for (int xAxis = 0; xAxis <doubleHolder.length; xAxis++) {
			
						for (int yAxis = 0; yAxis <doubleHolder.length - 1; yAxis++) {	
			
							innerPlanD = innerPlanD/doubleHolder[xAxis][yAxis];
							if (innerPlanD >= innerGravityLimit) {
						String formatJ = decForm.format(innerPlanD);
						System.out.println("Inner Planet is "+formatJ+" AU from the parent star.");
						if (innerPlanD >= innerH && innerPlanD <= outerH ) {
							System.out.println("Planet lies inside the Habitable Zone.");
						double starApparentBrightness= luminosity/(Math.pow(innerPlanD, 2));
						String format01 = decForm.format(starApparentBrightness);
							System.out.println("The parent star is "+format01+" times as bright as Sol on this planet.");
						double smallAngleApprox = diameter/innerPlanD;
						String format02 = decForm.format(smallAngleApprox);
							System.out.println("The parent star takes up around "+format02+" degrees of this planet's sky.");
						}
						obliquity = RandomizerMethod(0,180);
						String format06 = decForm.format(obliquity);
						System.out.println("This planet's obliquity is "+format06+" degrees");
						double eccentricity4 = RandomizerMethod(0.0068, 0.2488);
						String formatK = decForm.format(eccentricity4);
						System.out.println("Their eccentricity is "+formatK);
						double inclination4 = RandomizerMethod(0,17.142);
						String formatL = decForm.format(inclination4);
						System.out.println("Their inclination is "+formatL);
						System.out.println();	
							}
						}
					}
					}while (innerPlanD >= innerGravityLimit);
			
			}while (outerPlanD <= outerGravityLimit && innerPlanD >= innerGravityLimit);
		}
	}
}	