package twentynine;

public class BankAccount {
    private double balance;
    void deposit(double amount) {
           balance += amount;
    }
    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds");
        
        }
        else{
            System.out.println("Withdrawal successful "+amount);
            balance -= amount;
            


        }}
        public double getBalance() {
            return balance;
        }
        public static void main(String[] args) {
            BankAccount b = new BankAccount();
            b.deposit(10000);
            b.withdraw(500);
            System.out.println(b.getBalance());

        }
    
}
