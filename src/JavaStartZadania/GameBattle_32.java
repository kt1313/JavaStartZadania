package JavaStartZadania;

public class GameBattle_32 {

  /*  public void fight(GameTeam_32 team1, GameTeam_32 team2) {
        double team1Energy = attack(team1, team2);
        double team2Energy = attack(team2, team1);

    }

    private double attack(GameTeam_32 attacker, GameTeam_32 defender){
        double attackTeam =  attacker.totalAttack();
        double defenceTeam = defender.totalDefence();
        double attackResult = attackTeam - defenceTeam;
        return attackResult;
    }
*/
        static void fight(GameTeam_32 team1, GameTeam_32 team2) {
            double team2Energy = attack(team1, team2);
            double team1Energy = attack(team2, team1);
            double energyDiff = team1Energy - team2Energy;
            if (energyDiff > 0) {
                System.out.println("Wygrywa drużyna " + "team1" + " z przewagą " + energyDiff + " punktów energii");
            } else if (energyDiff < 0) {
                System.out.println("Wygrywa drużyna " + "team2" + " z przewagą " + (-energyDiff) + " punktów energii");
            } else {
                System.out.println("Remis, obie drużyny zachowały " + team1Energy + " energii");
            }
        }

        private static double attack(GameTeam_32 attacker, GameTeam_32 defender) {
            double attack = attacker.totalAttack();
            double defense = defender.totalDefence();
            double attackPower = attack - defense;
            double energy = defender.totalEnergy();
            if (attackPower > 0) {
                return energy - attackPower;
            } else {
                return energy;
            }
        }
    }



