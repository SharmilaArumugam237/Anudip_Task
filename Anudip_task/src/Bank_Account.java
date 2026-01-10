public class Bank_Account {
    String Account_Number;
    String Account_Holder_Name;
    double Balance;
    public Bank_Account(String Ac_No, String Ac_Name, double bal){
        Account_Number = Ac_No;
        Account_Holder_Name = Ac_Name;
        Balance = bal;
        System.out.println("AC/NO : "+ Account_Number);
        System.out.println("Name Of Accountant : "+Account_Holder_Name);
        System.out.println("Balance :"+Balance);
    }
    public void deposit(double Amt){
        Balance= Balance + Amt;
        System.out.println("Deposited Amt : "+ Amt);
    }
    public void withdraw(double Amt){
        if(Amt <= Balance) {
            Balance = Balance - Amt;
            System.out.println("Withdrawn Amt : " + Amt);
        }else {
            System.out.println("Insufficient Balance ");
        }

    }
    public  void display(){
        System.out.println("Clr Balance = "+ Balance);
    }
    public static void main(String args[]){
        Bank_Account b = new Bank_Account("C00101","Shagul",5000.75);
        b.withdraw(100.0);
        b.deposit(1000.0);
        b.display();

    }
}
