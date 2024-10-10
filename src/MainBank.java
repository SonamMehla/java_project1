public class MainBank {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.userFirstName = "Sonam";
        bank.userLastName = "Mehla";
        bank.accountNumber = 2092389;
        bank.balance = 100000;

        double getAccountBalance = bank.getAccountBalance();
        System.out.println(getAccountBalance);
        double withdraw = bank.withdraw();
        System.out.println(withdraw);
        double deposit = bank.deposit();
        System.out.println(deposit);
        System.out.println(bank.userFirstName);
        double updateDetails = bank.updateDetails();
        System.out.println(updateDetails);
    }
}
