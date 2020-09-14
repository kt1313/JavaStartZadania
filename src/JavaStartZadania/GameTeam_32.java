package JavaStartZadania;

class GameTeam_32 {
    public final static int CHARACTERS_NUMBER = 3;
    int memberNumber = 0;
    int totalEnergy = 0;
    int totalAttack = 0;
    int totalDefence = 0;
    String name;

    private GameCharacter_32[] team = new GameCharacter_32[CHARACTERS_NUMBER];

    public GameTeam_32(String name, GameCharacter_32 character2, GameCharacter_32 character3, GameCharacter_32 character1) {
        this.name = name;
        this.team[0] = character1;
        this.team[1] = character2;
        this.team[2] = character3;
    }
    //public GameTeam_32(String name) {     }


    public GameCharacter_32[] getTeam() {
        return team;
    }

    public void setTeam(GameCharacter_32[] team) {
        this.team = team;
    }

    public void addCharacterToTeam(GameCharacter_32[] team, GameCharacter_32 member) {
        memberNumber = 0;
        if (memberNumber < CHARACTERS_NUMBER) {
            team[memberNumber] = member;
            memberNumber++;
        }
    }

    public int totalEnergy() {
        memberNumber = 0;
        if (memberNumber < CHARACTERS_NUMBER) {
            for (GameCharacter_32 members : team) {
                totalEnergy += team[memberNumber].getEnergy();
                memberNumber++;
            }
        }
        return totalEnergy;
    }

    /**
     * double attack() {
     * double attack = 0;
     * for (GameCharacter character : characters) {
     * attack += character.totalAttack();
     * }
     * return attack;
     * }
     **/
    public int totalAttack() {
        memberNumber = 0;
        if (memberNumber < CHARACTERS_NUMBER) {
            for (GameCharacter_32 members : team) {
                totalAttack += team[memberNumber].totalAttack();
                memberNumber++;
            }
        }
        return totalAttack;
    }

    public int totalDefence() {
        memberNumber = 0;
        if (memberNumber < CHARACTERS_NUMBER) {
            for (GameCharacter_32 members : team) {
                totalDefence += team[memberNumber].totalDefence();
                memberNumber++;
            }
        }
        return totalDefence;
    }


}
