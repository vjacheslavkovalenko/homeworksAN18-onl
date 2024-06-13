public class CreditCard {

    private long accountBank;
    private long balance;

    public CreditCard (long accountBank, long balance) {
        this.accountBank = accountBank;
        this.balance = balance;
    }

    public long addMoney (long money) {
        balance += money;
        return balance;
    }

    public boolean outMoney (long money) {
        if (balance >= money) {
            balance -= money;
            return true;
        } else {
            System.out.println("Недостаточно средств.");
            return false;
        }
    }

        public void printInfo() {
            System.out.println("Номер счета: " + accountBank);
            System.out.println("Текущая сумма на счету: " + balance);
        }
    }
