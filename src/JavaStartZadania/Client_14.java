package JavaStartZadania;

class Client_14 {
    private String firstName;
    private String lastName;
    private boolean premium;

    public Client_14(String firstName, String lastName, boolean premium) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.premium = premium;
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

    public boolean isPremium() {
        return premium;
    }

    public void setPremium(boolean premium) {
        this.premium = premium;
    }
}