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
			
			ArrayList<Double> resArrListSolOrb = new ArrayList<Double>();
			ArrayList<String> resDispSolOrb = new ArrayList<String>();
			@SuppressWarnings("rawtypes")
			ArrayList<ArrayList> resArrListPlanOrb = new ArrayList<ArrayList>();
			
			resArrListSolOrb = orbParamCalc(mass);
			resDispSolOrb = displaySolarAtt(resArrListSolOrb);
			
			resArrListPlanOrb = planetaryOrbParam(resArrListSolOrb);
			
		}
	}
}	