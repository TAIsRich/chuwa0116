class BankAccount{
    private String holdersName;
    private int accountBalance;
    private int accountNumber;

    public BankAccount(String holdersName, int accountBalance, int accountNumber){
        this.holdersName = holdersName;
        this.accountBalance= accountBalance;
        this.accountNumber = accountNumber;
    }

    public int getBalance(){
        return accountBalance;
    }

    public int setBalance(int newValue){
        return newValue;
    }

    public void getDetails(){
        System.out.println("The details of your account is as following: " + "The account number of " + holdersName + " is " +
                accountNumber + "containing " + accountBalance);
    }
}

class SavingAccount extends BankAccount{
    private int interestAmount;

    public SavingAccount(String holdersName, int accountBalance, int accountNumber) {
        super(holdersName, accountBalance, accountNumber);
    }

    public void addInterest(){
        setBalance(this.getBalance() + interestAmount);
    }

}

class CheckingAccount extends BankAccount{
    private int linkedAtmCard;

    public CheckingAccount(String holdersName, int accountBalance, int accountNumber) {
        super(holdersName, accountBalance, accountNumber);
    }

    public void deductFee(){

    }
}