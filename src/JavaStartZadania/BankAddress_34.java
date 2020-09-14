package JavaStartZadania;

import java.util.Objects;

class BankAddress_34 {
    private String city;
    private String street;
    private String postalCode;
    private String homeNo;
    private String flatNo;

    public BankAddress_34(String city, String street, String postalCode, String homeNo, String flatNo) {
        this.city = city;
        this.street = street;
        this.postalCode = postalCode;
        this.homeNo = homeNo;
        this.flatNo = flatNo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getHomeNo() {
        return homeNo;
    }

    public void setHomeNo(String homeNo) {
        this.homeNo = homeNo;
    }

    public String getFlatNo() {
        return flatNo;
    }

    public void setFlatNo(String flatNo) {
        this.flatNo = flatNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankAddress_34 that = (BankAddress_34) o;
        return Objects.equals(city, that.city) &&
                Objects.equals(street, that.street) &&
                Objects.equals(postalCode, that.postalCode) &&
                Objects.equals(homeNo, that.homeNo) &&
                Objects.equals(flatNo, that.flatNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, street, postalCode, homeNo, flatNo);
    }
}
