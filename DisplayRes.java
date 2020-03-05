package ver1_3;

import java.util.ArrayList;
import java.util.Iterator;

public class DisplayRes {

	 static ArrayList<String> displaySolarAtt(ArrayList<Double> solarParamList) {
	
	Iterator<Double> iter = solarParamList.iterator();
	ArrayList<String> res = new ArrayList<String>();
	
	while(iter.hasNext()) {
		String startLine = "The star's complete attributes are: \n";
		res.add(startLine);
		String sunMass = "Mass is "+iter.next()+" Sun's \n";
		res.add(sunMass);
		String sunLum = "Luminosity "+iter.next()+" Sun's \n";
		res.add(sunLum);
		String sunDimtr = "Diameter is "+iter.next()+" Sun's \n";
		res.add(sunDimtr);
		String sunSurfTemp = "Surface Temperature is "+iter.next()+" Sun's \n";
		res.add(sunSurfTemp);
		String sunLife = "Lifetime is "+iter.next()+" Sun's \n" ;
		res.add(sunLife);
		String innGravLim = "Inner Gravity Limit is "+iter.next()+" AU. \n" ;
		res.add(innGravLim);
		String outGravLim = "Outer Gravity Limit is "+iter.next()+" AU. \n" ;
		res.add(outGravLim);
		String frostLine = "Frost Line starts at "+iter.next()+" AU. \n"  ;
		res.add(frostLine);
		String innHabZon = "Habitable Zone Inner Limit is "+iter.next()+" AU. \n" ;
		res.add(innHabZon);
		String outHabZon = "Habitable Zone Outer Limit is "+iter.next()+" AU. \n";
		res.add(outHabZon);
	}
	
	return res;
}
	 
	 static ArrayList<String> displayOutPlanAtt(ArrayList<Double> planParamList) {
			
			Iterator<Double> iter = planParamList.iterator();
			ArrayList<String> res = new ArrayList<String>();
			
			while(iter.hasNext()) {
				String planDAUStr = "Outer Planet is "+iter.next()+" AU from the parent star. \n";
				res.add(planDAUStr);
				String planObliqStr = "This planet's obliquity is "+iter.next()+" degrees. \n";
				res.add(planObliqStr);
				String planEccStr = "This planet's eccentricity is "+iter.next()+" degrees. \n";
				res.add(planEccStr);
				String planInclinStr = "This planet's inclination is "+iter.next()+ "degrees. \n";
				res.add(planInclinStr);
				
			}
			
			return res;
		}
	 
	 static ArrayList<String> displayInnPlanAtt(ArrayList<Double> planParamList) {
			
			Iterator<Double> iter = planParamList.iterator();
			ArrayList<String> res = new ArrayList<String>();
			
			while(iter.hasNext()) {
				
				String planDAUStr = "Inner Planet is "+iter.next()+" AU from the parent star. \n";
				res.add(planDAUStr);
				String planObliqStr = "This planet's obliquity is "+iter.next()+" degrees. \n";
				res.add(planObliqStr);
				String planEccStr = "This planet's eccentricity is "+iter.next()+" degrees. \n";
				res.add(planEccStr);
				String planInclinStr = "This planet's inclination is "+iter.next()+ "degrees. \n";
				res.add(planInclinStr);
				
			}
			
			return res;
		}
	
	
	
}
