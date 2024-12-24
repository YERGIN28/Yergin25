package Assignment1;

public class Main {

    public static void main(String[] args) {
        Sport volleyball = new Sport();
        volleyball.setValues("with ball",7,"dont miss the ball!");

        Sport football = new Sport();
        football.setValues("with ball",11,"score a goal!");


        System.out.print("Volleyball team size is: " + volleyball.team_size + "\n" + "Football team size is: " + football.team_size + "\n");

    }
}