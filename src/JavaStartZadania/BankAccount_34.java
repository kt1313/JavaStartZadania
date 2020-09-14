package JavaStartZadania;

import java.util.Objects;

class BankAccount_34 {
    private String accountNumber;
    private BankClient_34 owner;
    private int yearCreated;

    public BankAccount_34(String accountNumber, BankClient_34 owner, int yearCreated) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.yearCreated = yearCreated;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BankClient_34 getOwner() {
        return owner;
    }

    public void setOwner(BankClient_34 owner) {
        this.owner = owner;
    }

    public int getYearCreated() {
        return yearCreated;
    }

    public void setYearCreated(int yearCreated) {
        this.yearCreated = yearCreated;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankAccount_34 that = (BankAccount_34) o;

        return yearCreated == that.yearCreated &&
                Objects.equals(accountNumber, that.accountNumber) &&
                Objects.equals(owner, that.owner);
    }


    @Override
    public int hashCode() {
        return Objects.hash(accountNumber, owner, yearCreated);
    }
}
