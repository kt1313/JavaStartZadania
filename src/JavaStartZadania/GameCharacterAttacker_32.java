package JavaStartZadania;

public class GameCharacterAttacker_32 extends GameCharacter_32 {
    int attackBonus;

    public GameCharacterAttacker_32(String name, int energy, int attack, int defence, int attackBonus) {
        super(name, energy, attack, defence);
        this.attackBonus = attackBonus;
    }

    @Override
    double totalAttack() {
        return getAttack() + getAttack() * attackBonus;
    }

    public int getAttackBonus() {
        return attackBonus;
    }

    public void setAttackBonus(int attackBonus) {
        this.attackBonus = attackBonus;
    }
}
