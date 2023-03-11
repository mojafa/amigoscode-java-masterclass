import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount("John", BigDecimal.TEN, false);
        System.out.println(bankAccount.withdraw(new BigDecimal("5.00")));

        System.out.println(bankAccount.getBalance());
        System.out.println(bankAccount.withdraw(new BigDecimal("5.00")));
        System.out.println(bankAccount.getBalance());
       bankAccount.setBalance(new BigDecimal("100"));
        System.out.println(bankAccount.getBalance());

    }
}