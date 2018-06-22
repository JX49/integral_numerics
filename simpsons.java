
public class simpsons extends integral {
	
	public double fOfx1;
	
	simpsons()
	{
		
		
	}
	
	
	
	//I = (h/3) * ( f(x0) + (4*f(x1)) + f(x2));
	simpsons(double[] x,double[] fx)
	{
		super(x,fx);
		
		
		if(num != 3)
		{
			throw new IllegalArgumentException("simpson's rule requires 3 inputs");
		}		
		
		
		h = (end - start)/2.0;
		
		fOfx1 = fx[1];
		
	}
	
	public double integrate()
	{
		integral = (h/3.0) * (fOfx + (4 * fOfx1) + fOfxn);
		
		
		return integral;
		
	}

}
