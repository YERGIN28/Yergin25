package Assignment1;

import java.util.ArrayList;
import java.util.List;

public class SportsClub {
    private String clubName;
    private List<Player> players;

    // Constructor
    public SportsClub(String clubName) {
        this.clubName = clubName;
        this.players = new ArrayList<>();
    }

    // Getter and Setter methods
    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    // Add a player to the club
    public void addPlayer(Player player) {
        players.add(player);
    }

    // Display all players
    public void displayPlayers() {
        System.out.println("Players in " + clubName + ":");
        for (Player player : players) {
            System.out.println(player);
        }
    }
}
