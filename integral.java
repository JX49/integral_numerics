/**
 * Intergrator
 * integral.java
 * @author Jack Closs
 * 
 * Class contains method to evaluate the definite integral of a function over a given interval
 * In all implementations the integral class requires the function be evaluated at the given points 
 * on the interval before providing the integral class with its arguments. 
 * 
 * All classes extending from integral will require 2 inputs of arrays with the values for f(x)
 * and x
 * 
 *
 */
public class integral {

	
	public double h;
	public int num;
	public double start;
	public double end;
	public double fOfx;
	public double fOfxn;
	public double integral;
	
	
	 integral()
	{
		
	}
	
	integral(double[] x, double[] fx)
	{
		num = x.length;
		if(num != fx.length)
		{
			throw new IllegalArgumentException("arrays must match length");
		}
		
		start = x[0];
	    end = x[(num)-1];
	    
	    fOfx = fx[0];
	    fOfxn = fx[(num)-1];
	    
	    
		
		
		
		integral = 0;
	}
	
}
