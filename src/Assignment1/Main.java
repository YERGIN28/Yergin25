package Assignment1;

public class Main {
    public static void main(String[] args) {
        // Create sports
        Sport football = new Sport("Football");
        Sport basketball = new Sport("Basketball");

        // Create players
        Player player1 = new Player("John Doe", 25, "Forward", football);
        Player player2 = new Player("Alice Smith", 22, "Guard", basketball);
        Player player3 = new Player("Tom Brown", 28, "Goalkeeper", football);
        Player player4 = new Player("Mike Johnson", 20, "Defender", football);

        // Create a sports club
        SportsClub sportsClub = new SportsClub("Elite Sports Club");

        // Add players to the club
        sportsClub.addPlayer(player1);
        sportsClub.addPlayer(player2);
        sportsClub.addPlayer(player3);
        sportsClub.addPlayer(player4);

        // Display all players in the club
        sportsClub.displayPlayers();

        // Compare two players
        System.out.println("\nComparing Players:");
        System.out.println("Is player1 equal to player3? " + player1.equals(player3));
        System.out.println("Is player1 equal to player4? " + player1.equals(player4));

        // Modify a player's details
        System.out.println("\nUpdating Player Details:");
        player4.setName("Michael Johnson");
        System.out.println("Updated Player: " + player4);

        // Output all updated players
        System.out.println("\nUpdated List of Players:");
        sportsClub.displayPlayers();
    }
}
