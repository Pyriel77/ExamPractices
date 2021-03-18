import currency.Currency;

public class BankAccount {

    private String name;
    private String pinCode;
    private Currency currency;
    private float amount;


    public BankAccount(String name, String pinCode, Currency currency, float amount) {
        this.name = name;
        this.pinCode = pinCode;
        this.currency = currency;
        this.amount = amount;
    }

    public String getName() {
        return this.name;
    }

    public String getPinCode() {
        return this.pinCode;
    }

    public float getAmount() {
        return this.amount;
    }

    public Currency getCurrency() {
        return this.currency;
    }

    public void deposit(float amountToDeposit) {
        if(amountToDeposit < 0) {
            throw new IllegalArgumentException("Deposit is must be positive!");
        } else {
            this.amount += amountToDeposit;
        }
    }

    public float withdraw(String pinCode, float amountToWithdraw) {
        if (!pinCode.equals(getPinCode()) || amountToWithdraw > getAmount()){
            return 0;
        } else {
            this.amount -= amountToWithdraw;
            return amountToWithdraw;
        }
    }

    public float getAmountInUsd() {

        return this.amount * this.currency.getExchangeRateToUSD();
    }


}
