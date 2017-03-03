package zadaci_02_03_2017;

public class LinearEquation {
	
	private double a;
	private double b;
	private double c;
	private double d;
	private double e;
	private double f;
	
	public LinearEquation(double a, double b, double c, double d,double e,  double f) {
		
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
	}

	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public double getC() {
		return c;
	}

	public double getD() {
		return d;
	}
	
	public double getE(){
		return e;
	}

	public double getF() {
		return f;
	}
	
	
	/**
	 * A method named isSolvable() that returns true if ad - bc is not 0.
	 * @return
	 */
	public boolean isSolvable(){
		
		if ( (a * d) - (b * c) != 0.0  ) {
			return false;
		} else {
			return true;
		}
		
	}
	
	/**
	 * return the solution for the equation.
	 * @return
	 */
	public double getX(){
		
		return (e * d - b * f) / (a * d - b * c); 
		
	}
	
	/**
	 * return the solution for the equation.
	 * @return
	 */
	public double getY(){
		
		return (a * f - e * c) / (a * d - b * c); 
		
	}

}
