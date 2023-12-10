package decoratorPattern;

public class GSave implements BankAccountDecorator{

    private BankAccount bankAccount;

    public GSave(BankAccount account) {
        this.bankAccount = account;
    }

    @Override
    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public String showAccountType() {
        return bankAccount.showAccountType();
    }

    @Override
    public Double getInterestRate() {
        return 0.025;
    }

    @Override
    public Double getBalance() {
        return bankAccount.getBalance();
    }

    @Override
    public String showBenefits() {
        return bankAccount.showBenefits() + ", GCash Transfer";
    }

    @Override
    public Double computeBalanceWithInterest() {
        double balance = bankAccount.getBalance();
        return balance + bankAccount.getBalance() * getInterestRate();
    }

    @Override
    public String showInfo() {
        return bankAccount.showInfo();
    }
}
