
public class integralTester {
	
	public static void main(String[] args)
	{
		//function is f(x) = x^2 over interval 1 to 2, 1 to 3, and 1 to 4.
		// (x^3)/3
		
		
		double x0 = 1;
		double x1 = 2;
		double x2 = 3;
		double x3 = 4;
	
		
		double ans = ((8)/3) - (1/3);
		
		double [] x = new double[2];
		double [] fx = new double[2];
		
		
		x[0] = x0;
		x[1] = x1;
		
		fx[0] = 1 ;
		fx[1] = 4;
		
		
		trapezoid t = new trapezoid(x,fx);
		double ans2 = t.integrate();
		System.out.println("ans = " + ans + ", trapezoid = " + ans2);
		
		double [] xsimp = new double[3];
		double [] fxsimp = new double[3];
		
		double ans3 = ((27)/3) - (1/3);
		
		xsimp[0] = x0;
		xsimp[1] = x1;
		xsimp[2] = x2;
		
		fxsimp[0] = 1 ;
		fxsimp[1] = 4;
		fxsimp[2] = 9;
		
		simpsons si = new simpsons(xsimp,fxsimp);
		double ans4 = si.integrate();
		System.out.println("ans3 = " + ans3 + ", simpson's = " + ans4);
		
		
		double [] xsimp38 = new double[4];
		double [] fxsimp38 = new double[4];
		
		double ans5 = ((64)/3) - (1/3);
		
		xsimp38[0] = x0;
		xsimp38[1] = x1;
		xsimp38[2] = x2;
		xsimp38[3] = x3;
		
		fxsimp38[0] = 1 ;
		fxsimp38[1] = 4;
		fxsimp38[2] = 9;
		fxsimp38[3] = 16;
		
		simpsonsThreeEights si38 = new simpsonsThreeEights(xsimp38,fxsimp38);
		double ans6 = si38.integrate();
		System.out.println("ans5 = " + ans5 + ", simpson's = " + ans6);
		

		
		
	}

}
