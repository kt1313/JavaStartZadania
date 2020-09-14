package JavaStartZadania;

class GameCharacter_32 {
    private String name;
    private int energy;
    private int attack;
    private int defence;

    public GameCharacter_32(String name, int energy, int attack, int defence) {
        this.name = name;
        this.energy = energy;
        this.attack = attack;
        this.defence = defence;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public int getAttack() {
        return attack;
    }

    public int setAttack(int attack) {
        this.attack = attack;
        return attack;
    }

    public int getDefence() {
        return defence;
    }

    public int setDefence(int defence) {
        this.defence = defence;
        return defence;
    }

    String getInfo() {
        return "Name: " + getName() + ", Energy: " + getEnergy() + ", Attack: " + getAttack() + ", Defence: " + getDefence();
    }

    double totalAttack() {
        return attack;
    }

    double totalDefence() {
        return defence;
    }
}
