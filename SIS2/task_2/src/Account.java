public class Account  {
        protected double balance;
        protected int accNumber;
        public Account(int a)
        {
            balance = 0.0;
            accNumber = a;
        }
        public void addInterest()
        {

        }
        public void deposit(double sum){
            balance += sum;
        };
        public void withdraw(double sum){
            balance -=sum;
        };

    public double getBalance() {
        return balance;
    }

    public int getAccNumber() {
        return accNumber;
    }
    public void transfer(double amount, Account other)
    {

    }
    public final void print()
    {

    }
}
