class BankAccount {
    private int balance = 1000;
    synchronized void withdraw(int amount) {
        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() +
                    " is withdrawing " + amount);
            balance -= amount;
            System.out.println("Remaining balance: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() +
                    " - Insufficient balance");
        }
    }
}
class Person extends Thread {
    BankAccount account;
    int amount;
    Person(BankAccount account, int amount, String name) {
        super(name);
        this.account = account;
        this.amount = amount;
    }

    public void run() {
        account.withdraw(amount);
    }
}
public class BankTransaction {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        Person p1 = new Person(account, 700, "Person 1");
        Person p2 = new Person(account, 500, "Person 2");

        p1.start();
        p2.start();
    }
}
