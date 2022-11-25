
public class Stock {
private String symbol;
private String name;
private double previousClosingPrice;
private double currentPrice;


public Stock(String symbol,String name)
{
	this.symbol=symbol;
	this.name = name;
	
	
}


public double getChangePercent(double previousClosingPrice, double currentPrice) 
{
	double changePercent = ((currentPrice - previousClosingPrice) / previousClosingPrice)* 100;
	return changePercent;
}




public String getSymbol() {
	return symbol;
}
public void setSymbol(String symbol) {
	this.symbol = symbol;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getPreviousClosingPrice() {
	return previousClosingPrice;
}
public void setPreviousClosingPrice(double previousClosingPrice) {
	this.previousClosingPrice = previousClosingPrice;
}
public double getCurrentPrice() {
	return currentPrice;
}
public void setCurrentPrice(double currentPrice) {
	this.currentPrice = currentPrice;
}
}
