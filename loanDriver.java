import java.text.DecimalFormat;

//Driver program for the Loan program.
public class loanDriver{
  public static void main(String[]args){
    double annualInterestRate = 2.5;
    double annualInterestRateDecimal = annualInterestRate / 100;
    double loanAmount = 1000;
    int numberOfYears = 1;
    double monthlyRate = annualInterestRateDecimal / 12.0;
    int noOfPayments = numberOfYears*12;
    DecimalFormat df1 = new DecimalFormat(".##");
      
    // Create a loan with the default loanAmount, numberOfYears and annualInterestRate. 
    System.out.println("Details of Loan 1:");
    Loan Loan1 = new Loan();
    Loan1.getLoanAmount();
    Loan1.getNumberOfYears();
    Loan1.getAnnualInterestRate();
    Loan1.getTotalPayment();
    System.out.println("\n");
    
    
    // Create a loan with the default loanAmount, numberOfYears and annualInterestRate.
    System.out.println("Details of Loan 2:");
    Loan Loan2 = new Loan();
    Loan2.getLoanAmount();
    Loan2.getNumberOfYears();
    Loan2.getAnnualInterestRate();
    Loan2.getTotalPayment();
    System.out.println("\n");
    
    
    // Create a loan with loanAmount set at €2000, numberOfYears set at 1 and annualInterestRate
    // set at 3.5%
    System.out.println("Details of Loan 3:");
    Loan Loan3 = new Loan(3.5, 1, 2000);
    Loan3.getTotalPayment();
    System.out.println("\n");    
    
    
    // Create a loan with loanAmount set at €1000, numberOfYears set at 3 and annualInterestRate
    // set at 2.5%
    System.out.println("Details of Loan 4:");
    Loan Loan4 = new Loan(2.5, 3, 1000);
    Loan4.getTotalPayment();
    System.out.println("\n"); 
  }
}