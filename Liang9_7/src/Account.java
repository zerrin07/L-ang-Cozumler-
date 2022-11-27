import java.util.Date;

public class Account {
private int id =0;
private double balance=0.0;
private double annualInterestRate=0.0;
private Date dateCreated;

public Account()
{
	
}
public Account(int id,double balance,double annualInterestRate)
{
	this.id=id;
	this.balance=balance;
	this.annualInterestRate=annualInterestRate;
	
	
}

Date getDateCreated()
{
	return dateCreated;
}

public double getMonthlyInterestRate() {
	double MonthlyInterestRate = (annualInterestRate/100) / 12;
	return MonthlyInterestRate;
}
public double getMonthlyInterest()
{
	double MonthlyInterest = balance * getMonthlyInterestRate();
	return MonthlyInterest;
	
}



public double withdraw() {
    double newBalance =  balance + getMonthlyInterest();
    return newBalance;
    
}
public double deposit() {
	double newBalance =  balance - getMonthlyInterest();
	return newBalance;
}



public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
public double getAnnualInterestRate() {
	return annualInterestRate;
}
public void setAnnualInterestRate(double annualInterestRate) {
	this.annualInterestRate = annualInterestRate;
}



}
