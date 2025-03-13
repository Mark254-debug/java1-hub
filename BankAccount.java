public class BankAccount {
   
    private double balance;
    
    // Getter method for balance
    public double getBalance() {
        return balance;
    }
    
    // Setter method for deposit
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
    
    // Setter method for withdraw
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }
    
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        
        // Deposit some amount
        account.deposit(1000.0);
        
        // Withdraw some amount
        account.withdraw(500.0);
        
        System.out.println("Withdraw amount is: 500.0");
        System.out.println("Balance is: " + account.getBalance());
    }
}