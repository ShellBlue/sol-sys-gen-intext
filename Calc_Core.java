package ver1_3;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.text.DecimalFormat;

	public class Calc_Core {

	private static DecimalFormat decForm;
	 static Scanner scan;


	static class StarAttribute extends Calc_orbit_params {	
	
		static void SolSysCalculator (double mass) {
			
			decForm = new DecimalFormat ("##0.0000000");	
			ArrayList<String> resArrList = new ArrayList<String>();
			
			resArrList = orbParamCalc(mass);
			
			//an array to hold the random decimals produced by the RandomizerMethod//
		
		
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