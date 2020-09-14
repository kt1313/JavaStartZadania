package JavaStartZadania;

import java.util.Objects;

public class Streams_FootballResults_67 {
    String host;
    String guest;
    Integer hostGoals;
    Integer guestGoals;

    public Streams_FootballResults_67(String host, String guest, Integer hostGoals, Integer guestGoals) {
        this.host = host;
        this.guest = guest;
        this.hostGoals = hostGoals;
        this.guestGoals = guestGoals;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getGuest() {
        return guest;
    }

    public void setGuest(String guest) {
        this.guest = guest;
    }

    public Integer getHostGoals() {
        return hostGoals;
    }

    public void setHostGoals(Integer hostGoals) {
        this.hostGoals = hostGoals;
    }

    public Integer getGuestGoals() {
        return guestGoals;
    }

    public void setGuestGoals(Integer guestGoals) {
        this.guestGoals = guestGoals;
    }

    public int result() {
        return -(getHostGoals() - getGuestGoals());
    }

    public boolean findTeam(String name) {
        return getHost().equals(name)||getGuest().equals(name);
    }

    public int countGoals(){
        return getGuestGoals()+getHostGoals();
    }
     String[] teamsNames(){
        return new String[]{getHost(), getGuest()};
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Streams_FootballResults_67 that = (Streams_FootballResults_67) o;
        return Objects.equals(host, that.host) &&
                Objects.equals(guest, that.guest) &&
                Objects.equals(hostGoals, that.hostGoals) &&
                Objects.equals(guestGoals, that.guestGoals);
    }

    @Override
    public int hashCode() {
        return Objects.hash(host, guest, hostGoals, guestGoals);
    }

    @Override
    public String toString() {
        return host + " - " + guest + " (" + hostGoals + ":" + guestGoals + ")";
    }
}
