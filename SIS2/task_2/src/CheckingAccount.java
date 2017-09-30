public class CheckingAccount extends Account {
    private int counter;
    private final int FREE_TRANSACTIONS = 5;
    public void deductFee(double sum){
        balance -= (sum*0.02);
    }
    public CheckingAccount(int a) {
        super(a);
        counter = 0;
    }

    @Override
    public void addInterest() {
        super.addInterest();
    }

    @Override
    public void deposit(double sum) {
        super.deposit(sum);
    }

    @Override
    public void withdraw(double sum) {
        super.withdraw(sum);
        deductFee();
    }

    @Override
    public double getBalance() {
        return super.getBalance();
    }

    @Override
    public int getAccNumber() {
        return super.getAccNumber();
    }

    @Override
    public void transfer(double amount, Account other) {
        super.transfer(amount, other);
    }
}
