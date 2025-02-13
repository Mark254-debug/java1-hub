
    

abstract class BankAccount {
    protected double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Deposit of $" + amount + " successful. New balance: $" + balance);
    }

    public abstract void withdraw(double amount);
}

// 2. Subclass: SavingsAccount
class SavingsAccount extends BankAccount {
    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= 100) {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful. New balance: $" + balance);
        } else {
            System.out.println("Withdrawal failed. Minimum balance of $100 must be maintained.");
        }
    }
}

// 3. Subclass: CheckingAccount
class CheckingAccount extends BankAccount {
    public CheckingAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        double transactionFee = 1.0;
        if (balance - (amount + transactionFee) >= 0) {
            balance -= (amount + transactionFee);
            System.out.println("Withdrawal of $" + amount + " successful. Transaction fee of $1 applied. New balance: $" + balance);
        } else {
            System.out.println("Withdrawal failed. Insufficient funds to cover transaction fee.");
        }
    }
}

// Demonstration class
public class BankDemo {
    public static void main(String[] args) {
        // Create SavingsAccount object
        SavingsAccount savings = new SavingsAccount(500);
        System.out.println("Savings Account Balance: $" + savings.getBalance());
        savings.deposit(100);
        savings.withdraw(200);
        savings.withdraw(500); // Should fail

        System.out.println();

        // Create CheckingAccount object
        CheckingAccount checking = new CheckingAccount(200);
        System.out.println("Checking Account Balance: $" + checking.getBalance());
        checking.deposit(50);
        checking.withdraw(50);
        checking.withdraw(200); // Should fail
    }
}