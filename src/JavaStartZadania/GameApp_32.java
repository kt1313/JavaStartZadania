package JavaStartZadania;

 class GameApp_32 {
    public static void main(String[] args) {

        GameCharacterAttacker_32 character1 = new GameCharacterAttacker_32("Wit", 45, 15, 35, 10);
        GameCharacterAttacker_32 character2 =  new GameCharacterAttacker_32 ("Brat Wita", 40, 29, 30, 15);
        GameCharacterDefender_32 character3 =  new GameCharacterDefender_32("Siostra Wita", 35, 20, 45, 15);
        GameCharacterAttacker_32 character4 =  new GameCharacterAttacker_32 ("Michał", 40, 35, 15, 20);
        GameCharacterDefender_32 character5 =  new GameCharacterDefender_32 ("Aleksij", 42, 15, 45, 12);
        GameCharacterDefender_32 character6 =  new GameCharacterDefender_32 ("Herman", 40, 25, 55, 20);

        GameTeam_32 team1 = new GameTeam_32("TeamOne", character2, character3, character1);
        GameTeam_32 team2 = new GameTeam_32("TeamTwo", character5, character6, character4);
        GameBattle_32.fight(team1, team2);
    }
}
