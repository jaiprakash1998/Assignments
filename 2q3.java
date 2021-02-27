import java.util.*;


class CurrentAccount extends Assignment2Q3 {
    int totalDeposits = 10000;
    int creditLimit = 2000;
    @Override
    public int getCash() {
        return totalDeposits+creditLimit;
    }
}

class SavingsAccount extends Assignment2Q3 {
    int totalDeposits = 10000;
    int fixedDepositAmount = 5000;
    @Override
    public int getCash() {
        return totalDeposits+fixedDepositAmount;
    }
}

 class Assignment2Q3 {
    public int totalCashInBank(ArrayList<Integer> cash){
        int s=cash.size();
        int total=0;
        for (int i=0;i<s;i++) {
            total+=cash.get(i);
        }
        return total;
    }
    public int getCash(){
        return 0;
    }
    public static void main(String[] args) {}
}