package JavaStartZadania;

import java.util.Objects;

class BankClient_34 {
    private String firstName;
    private String lastName;
    private String id;
    private BankAddress_34 address;

    public BankClient_34(String firstName, String lastName, String id, BankAddress_34 address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BankAddress_34 getAddress() {
        return address;
    }

    public void setAddress(BankAddress_34 address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankClient_34 owner = (BankClient_34) o;
        return Objects.equals(firstName, owner.firstName) &&
                Objects.equals(lastName, owner.lastName) &&
                Objects.equals(id, owner.id) &&
                Objects.equals(address, owner.address);
    }


    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, id, address);
    }


}
