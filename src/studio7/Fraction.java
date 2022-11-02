package studio7;

public class Fraction {
	
	private int numerator;
	private int denominator;
	
	public Fraction(int numerator, int denominator)
	{
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	public Fraction sum(Fraction other)
	{
		if (this.denominator != other.denominator) {
			int commonDenom = this.denominator * other.denominator;
			int thisNumer = this.numerator * other.denominator;
			int otherNumer = other.numerator * this.denominator;
			int totalNumer = thisNumer + otherNumer;
			Fraction sum = new Fraction(totalNumer, commonDenom);
			return sum;
		}
		else {
			Fraction sum = new Fraction(this.numerator + other.numerator, this.denominator);
			return sum;
		}
		
	}
	
	public Fraction multiply(Fraction other)
	{
		Fraction mult = new Fraction(this.numerator * other.numerator, this.denominator * other.denominator);
		return mult;
	}
	
	public Fraction reciprocal() {
		Fraction reciprocal = new Fraction(this.denominator, this.numerator);
		return reciprocal;
	}
	
	public Fraction simplify(Fraction other) {
		int commonDenom = this.denominator * other.denominator;
		int thisNumer = this.numerator * other.denominator;
		int otherNumer = other.numerator * this.denominator;
		int totalNumer = thisNumer + otherNumer;
		
		/*int gcd;
		if(commonDenom % totalNumer == 0) { //for proper fractions
			gcd =  totalNumer; //numerator value is gcd
			return simplify(commonDenom, totalNumer);
		}
		
		//...this part is unchanged from Studio 6
		else {
			return gcd(q, p%q);
		}
		}*/
	}
	
	public String toString()
	{
		return this.numerator+ "/" + this.denominator;
	}
	 
	
	public static void main(String[] args) {
		Fraction frac = new Fraction(1, 3);
		Fraction frac2 = new Fraction(3, 4);
		System.out.println(frac.sum(frac2));
		System.out.println(frac.multiply(frac2));
		System.out.println(frac.reciprocal());
	}

}
