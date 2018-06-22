
public class simpsonsThreeEights extends integral {
	
	public double fOfx1;
	public double fOfx2;
	
	simpsonsThreeEights()
	{
		
		
	}
	
	
	
	//   I = (3*h/8) * ( f(x0) + (3*f(x1))+ (3*f(x2)) + f(x3));
	simpsonsThreeEights(double[] x,double[] fx)
	{
		super(x,fx);
		
		
		if(num != 4)
		{
			throw new IllegalArgumentException("simpson's 3/8 rule requires 4 inputs");
		}		
		
		
		h = (end - start)/3.0;
		
		fOfx1 = fx[1];
		fOfx2 = fx[2];
	}
	
	public double integrate()
	{
		integral = (3*h/8.0) * (fOfx + (3 * fOfx1) + (3 * fOfx2) + fOfxn);
		
		
		return integral;
		
	}

}