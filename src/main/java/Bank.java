import java.util.ArrayList;
import java.util.List;

public class Bank {

    List<BankAccount> bankAccounts = new ArrayList<>();

    public List<BankAccount> createAccount(BankAccount bankAccount) {

        bankAccounts.add(bankAccount);

        return bankAccounts;
    }

    public float getAllMoney() {

        float sum = 0.0f;

        for (BankAccount bankAccount : bankAccounts) {
            sum += bankAccount.getAmountInUsd();
        }

        return sum;
    }

    public List<BankAccount> getBankAccounts() {
        return bankAccounts;
    }

}
