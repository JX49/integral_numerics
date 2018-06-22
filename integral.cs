//definite intergal finder
using System;

namespace integral
{





	//<summary> This class can take in doubles in arrays and calculate
	// the definite integral from a given step, the class 
	//accepts a double array x to represent the points
	//at which the function is evaluated over.
	// array fx is are the points of the function evaluated at x</summary>
	public class integral
	{

		//<summary>
		//h is the distance between points
		// num is the number of points deived fro the number of 
		//elements in the array
		//start and end are the starting and ending points respectivley
		//f0fx is the value of f(x) at the first value of x
		//f0fxn is the value of f(x) at the last value of x
		//the definiteIntegral stores the numeric value of the dfinite integral </summary>
		protected double h;
		protected int num;
		protected double start;
		protected double end;
		protected double fOfx;
		protected double fOfxn;
		protected double definiteIntegral;

		private static readonly double[] DEFAULT_X = new double[1]{0};



		//<summary>
		//default constructor that will initialize the arrays to DEFAULT_X if no 
		//arrays are passed</summary>
		public integral ():this(DEFAULT_X,DEFAULT_X)
		{		
		}


		//<summary>
		// this constructor takes in the values for the 
		// x axis or the points at which f(x)
		//is to be evaluated. It also takes the array with points f(x)
		// if the arrays do not share the same size, an illegalargument exception 
		//witll be thrown. The constructor initializes the data members start,
		//end, f0fx, f0fxn, and definiteIntegral </summary>
		//<param name="x"> x conatins the points where we want
		// to find f(x). <param>
		//<param name= "fx"> fx is the array that contains the values
		// of f evaluated at x</param>
		public integral(double[] x, double[] fx)
		{
			
			
			num = x.Length;
			if(num != fx.Length)
			{
				throw (new IllegalArgumentException("arrays must match length"));
			}


			start = x[0];
			end = x[(num)-1];

			fOfx = fx[0];
			fOfxn = fx[(num)-1];

			definiteIntegral = 0;
		}
	}



	//<summary> This exception occurs if an illigal argument is passed to integral</summary>
	public class IllegalArgumentException: Exception
	{
		public IllegalArgumentException(string message):base(message)
		{
		}
	}



	//<summary>this class implements the trapezoid method of integration
	//It will call the integral base class</summary>
	public class trapezoid : integral
	{

		private static readonly double[] DEFAULT_X = new double[1]{0};


		public trapezoid():this(DEFAULT_X, DEFAULT_X)
		{

		}

		//<summary> This class will initialize the data members in integral as wel as h.
		//<param name="x"> x conatins the points where we want
		// to find f(x). <param>
		//<param name= "fx"> fx is the array that contains the values
		// of f evaluated at x</param>
		public trapezoid(double[] x, double[] fx): base(x,fx)
		{
						h = end - start;
		}
		//<summary>This method will evaluate the definite integral of the function
		//following the trapezoid rule.((h/2) * f(x) + f(xn))</summary>
		//<returns> returns the definite integral value as a double</returns>
		public double integrate()
		{
			definiteIntegral = (h/2.0) * (fOfx + fOfxn);


			return definiteIntegral;

		}

	}








	public class integralTester {

		static void Main(String[] args)
		{
			//function is f(x) = x^2 over interval 1 to 2, 1 to 3, and 1 to 4.
			// (x^3)/3


			double x0 = 1;
			double x1 = 2;


			double ans = ((8)/3) - (1/3);

			double [] x = new double[2];
			double [] fx = new double[2];


			x[0] = x0;
			x[1] = x1;

			fx[0] = 1 ;
			fx[1] = 4;


			trapezoid t = new trapezoid(x,fx);
			double ans2 = t.integrate();
			Console.WriteLine("ans = " + ans + ", trapezoid = " + ans2);

		}
	}
}

