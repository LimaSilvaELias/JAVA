package entities;

public class CurrencyConverter {

	public double dollarPrice;
	public double bought;
	public double dollarToReais;
	public double painInReais;
	
	public double dollarPrice() {
		return dollarPrice;
	}
	public double bought() {
		return bought;
	}
	public double dollarToReais() {
		return 0.06 * dollarPrice() * bought();
	}
	public double paidInReais() {
		return bought() * dollarPrice() + dollarToReais();
	}
	public String toString() {
		return "Amount to be paid in reais = " + String.format("%.2f",paidInReais());
	}
}
