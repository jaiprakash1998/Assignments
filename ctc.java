import java.util.*;
import java.util.Scanner;
class TaxAmount{
    public double calculateTaxAmount(int ctc){
    	if (ctc>0&&ctc<80000) {
    		return 0;
    	}
    	else if(ctc>80000&&ctc<300000){
    		return (ctc/100)*10;
    	}
    	else if(ctc>300000&&ctc<500000){
    		return (ctc/100)*20;
    	}
    	else if(ctc>500000&&ctc<1000000){
    		return (ctc/100)*30;
    	}
    	else 
    		return 0;
    }
}
 class Assignment1Q5 {
    public static void main(String args[]) {
    	Scanner s=new Scanner(System.in);
    	int ctc=s.nextInt();
    	TaxAmount t=new TaxAmount();
    	t.calculateTaxAmount(ctc);
    }
}

