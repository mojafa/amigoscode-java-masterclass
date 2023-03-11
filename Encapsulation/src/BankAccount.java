import java.math.BigDecimal;

public class BankAccount {
    private String name;

   private BigDecimal balance;
    private  boolean hasOverdraft;

    public BigDecimal withdraw(BigDecimal amount) {
        if (balance.subtract(amount).compareTo(BigDecimal.ZERO) >= 0) {
            this.balance = this. balance.subtract(amount);
            return amount;
        }
        return BigDecimal.ZERO;
        }

    public BankAccount() {
    }

    public BankAccount(String name, BigDecimal balance, boolean hasOverdraft) {
        this.name = name;
        this.balance =balance;
        this.hasOverdraft = hasOverdraft;

    }


    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
