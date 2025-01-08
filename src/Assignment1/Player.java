package Assignment1;

public class Player {
    private String name;
    private int age;
    private String position;
    private Sport sport;

    // Constructor
    public Player(String name, int age, String position, Sport sport) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.sport = sport;
    }

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Sport getSport() {
        return sport;
    }

    public void setSport(Sport sport) {
        this.sport = sport;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", position='" + position + '\'' +
                ", sport=" + sport +
                '}';
    }

    // Compare players by name and sport
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Player)) return false;
        Player other = (Player) obj;
        return name.equals(other.name) && sport.getName().equals(other.sport.getName());
    }
}

