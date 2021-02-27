import java.util.*;

class SiCi {
    public double simpleInterest(double principalAmount,int time,double interestRate){
    	return (principalAmount*time*interestRate)/100;
    }
    public double compoundInterest(double principalAmount,int time,double interestRate){
    	return pow(principalAmount(1+interestRate),time) - principalAmount;
    }
}
public class Assignment1Q3 {
    public static void main (String args[]) {
    	SiCi s= new SiCi();
    }
}

