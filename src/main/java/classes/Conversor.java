package classes;

public class Conversor {

	
	
	public double RadiensToDegrees(double radien){
		
		double result = (radien*180)/Math.PI;
		
		return result;
	}
	
	public double DegreesToRadiens(double degree){
		
		double result = (degree*Math.PI)/180;
		
		return result;
	}
}
