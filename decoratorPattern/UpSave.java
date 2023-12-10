package decoratorPattern;

public class UpSave implements BankAccountDecorator{

    private BankAccount bankAccount;

    public UpSave(BankAccount account) {
        this.bankAccount = account;
    }

    @Override
    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public String showAccountType() {
        return "UpSave";
    }

    @Override
    public Double getInterestRate() {
        return 0.04;
    }

    @Override
    public Double getBalance() {
        return 10000.0;
    }

    @Override
    public String showBenefits() {
        return bankAccount.showBenefits() + ", With Insurance";
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
