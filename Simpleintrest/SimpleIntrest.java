package Simpleintrest;
/*
 * @author:Anjalimadhavi
 * */
public class SimpleIntrest {
	/*
	 * @param p indicates principal value
	 * @param t indicates timeperiod
	 * @param r indicates rate of intrest
	 * */
	public double calculateIntrest(double d,double e,double f ) {
		return (d*e*f)/100;
	}
	int pow(int power,int base) {
		int ans=1;
		for(int i=1;i<=power;i++) {
			ans=ans*base;
		}
		return ans;
	}
	public int compoundIntrest(int p,int r,int n,int t) {
		int res=(1+r/n);
		return p*pow(n*t,res);
	}
	
	
}
