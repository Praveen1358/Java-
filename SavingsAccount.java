package n;
class Account{
    int balance;
    public Account(int balance) {
        this.balance = balance;
    }
}

public class SavingsAccount extends Account {
    int interestRate;
    public SavingsAccount(int balance, int interestRate) {
        super(balance);
        this.interestRate=interestRate;
    
    }
    public float getInterest(int balance,int interestRate) {
        float re=(balance * interestRate) / 100;
        super.balance+=re;
       return re;
         
    }
    public float checkBalance(){
        return super.balance;
    }
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount(1000,12);
       System.out.println( s.getInterest(s.balance,s.interestRate));
       System.out.println(s.checkBalance());
    }

    
}
