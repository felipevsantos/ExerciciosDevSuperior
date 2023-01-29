package entities;

public class AccountBank {

    private int numberAccount;
    private String holderAccount;
    private double value;

    public AccountBank(int numberAccount, String holderAccount){

        this.numberAccount = numberAccount;
        this.holderAccount = holderAccount;
        value = 0;

    }

    public AccountBank(int numberAccount, String holderAccount,double value){

        this.numberAccount = numberAccount;
        this.holderAccount = holderAccount;
        this.value = value;

    }


    public int getNumberAccount() {
        return numberAccount;
    }

    public void setNumberAccount(int numberAccount) {
        this.numberAccount = numberAccount;
    }

    public String getHolderAccount() {
        return holderAccount;
    }

    public void setHolderAccount(String holderAccount) {
        this.holderAccount = holderAccount;
    }

    public double getValue() {
        return value;
    }

    public void deposit(double value){

        this.value += value;
    }
    public void withdraw(double value){

        this.value -= value + 5.00;
    }
   public String toString(){
        return
                 "Account " + numberAccount
                + ", Holder: " + holderAccount
                + ", Balance: $ " + String.format("%.2f",value);


   }

}
