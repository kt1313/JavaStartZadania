package JavaStartZadania;

public class GameCharacterDefender_32 extends GameCharacter_32{
    int defenceBonus;

    public GameCharacterDefender_32(String name, int energy, int attack, int defence, int defenceBonus) {
        super(name, energy, attack, defence);
        this.defenceBonus = defence;
    }
    @Override
     double totalDefence(){
        return setDefence(super.getDefence() + defenceBonus);
    }

    public int getDefenceBonus() {
        return defenceBonus;
    }

    public void setDefenceBonus(int defendBonus) {
        this.defenceBonus = defendBonus;
    }
}
