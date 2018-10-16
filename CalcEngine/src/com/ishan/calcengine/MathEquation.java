package com.ishan.calcengine;

public class MathEquation {
	
	public double leftval ;
	public double rightval ;
	public char opChar ;
	public double result;
	
	public void execute() {
	
		switch(opChar) {
		
		case 'a' :
		result = leftval + rightval;
		break;
		
		case 's' :
		result	= leftval - rightval;
		break;
		
		case 'd' :
		result = rightval != 0 ? leftval/rightval : 0.0d; 
		break;
		
		case 'm' :
		result	= leftval * rightval;
		break;
		
		default :
			System.out.println("Error ");
			result = 0.0d;				
			break;}
	}
}
