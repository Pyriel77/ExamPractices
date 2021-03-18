package currency;

public class Currency {


    private String code;
    private String centralBank;
    public float exchangeRateToUSD;

    public Currency(String code, String centralBank, float exchangeRateToUSD) {
        this.code = code;
        this.centralBank = centralBank;
        this.setExchangeRateToUSD(exchangeRateToUSD);
    }

    public String getCode() {
        return this.code;
    }

    public String getCentralBank() {
        return this.centralBank;
    }

    public float getExchangeRateToUSD() {
        return this.exchangeRateToUSD;
    }

    public void setExchangeRateToUSD(float exchangeRateToUSD) {
        if (exchangeRateToUSD <= 0) {
            throw new IllegalArgumentException("Exchange rate must be positive!");
        }
        this.exchangeRateToUSD = exchangeRateToUSD;
    }


}
