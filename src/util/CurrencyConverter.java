package util;

public class CurrencyConverter {
	public static double dollarTax = 6.00;
	
	public static double dollar(double dollarValue, double dollarAmount) {
		double valorReal = dollarValue * dollarAmount;
		return valorReal += valorReal * dollarTax / 100;
	}
	
}
