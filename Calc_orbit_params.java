package ver1_3;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Calc_orbit_params extends DisplayRes {

	private static DecimalFormat decForm;
	
	static double Randomizer(double minimum, double maximum) {
		
		decForm = new DecimalFormat ("##0.0000000");
		double a = minimum;		double b = maximum;
		double result = 0;		int counter = 0;
		
	do {
		//a way to pseudo-randomly generate decimals//
			result = (Math.random()*(1+((b-a)+a)));
		//the part below is to ensure the resulting decimal
		//is in the range between input a and input b 
		//before proceeding with the loop
			if (result >= a && result <=b) {
			counter ++;
				}	
			}while ( counter <= 50);
			
	return result;
	
}

	static ArrayList<Double> orbParamCalc(double mass) {
		
		ArrayList<Double> solarRes = new ArrayList<>(10);
		
		double lum, dimtr, surfTemp, lifetime;
		
		double innGravLim, outGravLim, frostLine;
		 	   
		double habVal, innHab, outHab; 
				
		lum = Math.pow(mass, 3);				dimtr = Math.pow(mass, 0.74);
		surfTemp = Math.pow(mass,0.505);		lifetime = Math.pow(mass, -2.5);
		innGravLim = mass * 0.1;				outGravLim = mass * 40;
		
		frostLine = 4.85*(Math.pow(lum, 0.5));	habVal = Math.pow(lum, 0.5);
		innHab = habVal *0.95;					outHab = habVal *1.35;
		
		solarRes.add(mass); 		solarRes.add(lum); 			solarRes.add(dimtr);
		solarRes.add(surfTemp);		solarRes.add(lifetime);		solarRes.add(innGravLim);
		solarRes.add(outGravLim);	solarRes.add(frostLine);	solarRes.add(habVal);
		solarRes.add(innHab);		solarRes.add(outHab);		
		
		return solarRes;
	}
	
	static ArrayList<ArrayList> planetaryOrbParam(ArrayList<Double> solarParamList){
		
		ArrayList<Double> clone = (ArrayList<Double>) solarParamList.clone();
		ArrayList<ArrayList> res = new ArrayList<ArrayList>();
	
		double randCoef, lum, dimtr;
		
		double obliq, ecc, inclin;
		
		double frostLine, innGravLim, outGravLim, outerPlanD, innerPlanD;
		
		double innHabVal, outHabVal;
		
		double doubleHolder [][] = new double [10][10];
		
		lum = clone.get(1);
		dimtr = clone.get(2);
		innGravLim = clone.get(5);
		outGravLim = clone.get(6);
		frostLine = clone.get(7);
		innHabVal = clone.get(9);
		outHabVal = clone.get(10);
		
		clone.clear();
		
		randCoef = Randomizer(1.4,2.0);
		
		do { 
			for (int x = 0; x <doubleHolder.length; x++) {
				for (int y = 0; y <doubleHolder.length - 1; y++) {
					doubleHolder[x][y] = randCoef;
					}
				
			}
			
			outerPlanD = (frostLine*randCoef) - 1;
			clone.add(outerPlanD);
			obliq = Randomizer(0,180);
			clone.add(obliq);
			ecc = Randomizer(0.0068,0.2488);
			clone.add(ecc);
			inclin = Randomizer(0,17.142);
			
			res.add(displayOutPlanAtt(clone));
			
			clone.clear();
			
			do {
				for (int x = 0; x <doubleHolder.length; x++) {
					for (int y = 0; y <doubleHolder.length - 1; y++) {
					
					outerPlanD = outerPlanD*doubleHolder[x][y];
					clone.add(outerPlanD);
					
					if(outerPlanD <= outGravLim) {
						
						obliq = Randomizer(0,180);
						clone.add(obliq);
						ecc = Randomizer(0.0068,0.2488);
						clone.add(ecc);
						inclin = Randomizer(0,17.142);
						
						res.add(displayOutPlanAtt(clone));

						clone.clear();
					}
					
					}
				}
			}while (outerPlanD >= outGravLim);
			
			innerPlanD = (frostLine/randCoef) + 1;
			clone.add(innerPlanD);
			obliq = Randomizer(0,180);
			clone.add(obliq);
			ecc = Randomizer(0.0068,0.2488);
			clone.add(ecc);
			inclin = Randomizer(0,17.142);
			clone.add(inclin);
			
			res.add(displayInnPlanAtt(clone));
			
			clone.clear();
			
			do {
				for (int x = 0; x <doubleHolder.length; x++) {
					for (int y = 0; y <doubleHolder.length - 1; y++) {
					
						innerPlanD = innerPlanD/doubleHolder[x][y];
						
						if(innerPlanD >= innGravLim) {
							clone.add(innerPlanD);
						if(innerPlanD >= innHabVal && innerPlanD <= outHabVal) {
							double starLum = lum/(Math.pow(innerPlanD, 2));
							clone.add(starLum);
							double angApprox = dimtr/innerPlanD;
							clone.add(angApprox);
							
						}
							obliq = Randomizer(0,180);
							clone.add(obliq);
							ecc = Randomizer(0.0068,0.2488);
							clone.add(ecc);
							inclin = Randomizer(0,17.142);
							clone.add(inclin);
							
							res.add(displayInnPlanAtt(clone));
							
							clone.clear();
						}
						
					}
					}
				
			}while (innerPlanD >= innGravLim);
			
		 }while (outerPlanD <= outGravLim && innerPlanD >= innGravLim);
		
		return res;
		}
	}