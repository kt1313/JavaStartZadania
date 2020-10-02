package JavaStartZadania;

import java.util.Objects;

 public class Zad20_Player implements Comparable<Zad20_Player>{
    String nickname;
    int points;

    public Zad20_Player(String nickname,int points){
        this.nickname=nickname;
        this.points=points;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getPoints() {
        return points;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Zad20_Player that = (Zad20_Player) o;
        return points == that.points &&
                nickname.equals(that.nickname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nickname, points);
    }

    @Override
    public String toString() {
        return "Player: " + nickname + ", points: " + points+"\n";
    }

     @Override
     public int compareTo(Zad20_Player o) {
         return 0;
     }
 }

