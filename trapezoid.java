
public class trapezoid extends integral{
	
	
	
	trapezoid()
	{
		
		
	}
	
	
	
	//I = (h/2) * ( f(x0) + f(x1) );
	trapezoid(double[] x,double[] fx)
	{
		super(x,fx);
		h = end - start;
		
		
		
	}
	
	public double integrate()
	{
		integral = (h/2.0) * (fOfx + fOfxn);
		
		
		return integral;
		
	}
	
	//todo make an interface for compound rules.
	
}
