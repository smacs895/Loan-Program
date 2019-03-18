import java.time.*;
import java.text.DecimalFormat;

// A program to calculate a loan with the loanAmount, numberOfYears for the loan and an
// annualInterestRate. 
public class Loan {
  private double annualInterestRate = 2.5;
  private double annualInterestRateDecimal = annualInterestRate / 100;
  private int numberOfYears = 1;
  private double loanAmount = 1000;
  private static DecimalFormat df1 = new DecimalFormat(".##");
  LocalDate today1 = LocalDate.ofYearDay(2019,27);

  // Default Constructor.
  public Loan(){
  }
  
  // Constructs a loan with specified interest rate, years and loan amount, passed in as parametres.
  public Loan(double annualInterestRate,int numberOfYears,double loanAmount){
      this.annualInterestRate = annualInterestRate;
      this.annualInterestRateDecimal = annualInterestRate / 100;
      System.out.println("The interest rate for this loan is: " + annualInterestRate + "%");
      this.numberOfYears = numberOfYears;
      System.out.println("The Number of Years for this loan is: " + (int) numberOfYears);
      this.loanAmount = loanAmount;
      System.out.println("The Loan Amount is: €" + df1.format(loanAmount));
  }
  
  // Returns the annual interest rate of this loan.
  public double getAnnualInterestRate(){
      // Output for Testing.
      System.out.println("The annual interest rate is: " + annualInterestRate + "%");
      return annualInterestRate;
  }
  
  // Returns the number of years of this loan.
  public int getNumberOfYears(){
      // Output for Testing.  
      System.out.println("The number of years for this loan is: " + numberOfYears);
      return numberOfYears;
  }
    
  // Returns the amount of this loan. 
  public double getLoanAmount(){      
      // Output for Testing.
      System.out.println("The loan amount is: €" + loanAmount);
      return loanAmount;
  }
    
  // Returns the monthly payment of this loan. 
  public double getMonthlyPayment(){
    // Monthly interest rate is the yearly rate divided by 12.
    double monthlyRate = annualInterestRateDecimal / 12.0;
       
    // The number of payments is the number of years times 12.
    int noOfPayments = numberOfYears*12;
       
    // Calculate the monthly payment. 
    double monthlyPayment = (loanAmount*monthlyRate)/(1-Math.pow((1+monthlyRate), -noOfPayments));
    
    // Output for testing. 
    System.out.println("The monthly repayment is: €" + df1.format(monthlyPayment));
    return monthlyPayment;
  }  
  
  // Returns the total payment of this loan.
  public double getTotalPayment(){
    double monthlyPayment = getMonthlyPayment();
    int noOfPayments = numberOfYears*12;
    
    // Total payment to be paid is the monthly payment(which includes interest) * the
    // number of payments in the length of the loan. 
    double TotalPayment = monthlyPayment * noOfPayments;
      
    // Output for Testing.
    System.out.println("The total repayment for this loan is: €" + df1.format(TotalPayment));
      
    return TotalPayment;
  }
  
  // Returns the date of the creation of this loan. 
  public void getLoanDate(){
    LocalDate date1 = LocalDate.ofYearDay(2019,36);
      
    // Output for testing.
    System.out.println(date1);
  }  
  
  // Sets a new annual interest rate to this loan.
  public void setAnnualInterestRate(double annualInterestRate){
    this.annualInterestRate = annualInterestRate;
    this.annualInterestRateDecimal = annualInterestRate / 100;  
    
    // Output for testing.
    System.out.println("The interest rate for this loan is: " + annualInterestRate + "%");
  }
    
  // Sets a new number of years to this loan.
  public void setNumberOfYears(int numberOfYears){
    this.numberOfYears = numberOfYears;
      
    // Output for testing.
    System.out.println("The Number of Years is: " + (int) numberOfYears);
  }
    
  // Sets a new amount to this loan.
  public void setLoanAmount(double loanAmount){
    this.loanAmount = loanAmount;
    
    // Output for testing.
    System.out.println("The Loan Amount is: €" + df1.format(loanAmount));
  }
}