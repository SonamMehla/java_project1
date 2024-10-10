public class Bank {
    String userFirstName;
    String userLastName;
    int accountNumber;
    double balance;

    public double getAccountBalance(){
        return balance;
    }
    public double withdraw(){
        System.out.println("You withdraw $2000 from " + accountNumber + " Acc No");
        System.out.print("your current balance is :");
        return balance-2000;
    }
    public double deposit(){
        System.out.println("You deposit $5000 in " + accountNumber + " Acc No");
        System.out.print("your current balance is :");
        return balance+5000;
    }
    public double updateDetails(){
        return balance -(withdraw()+deposit());
    }
}
