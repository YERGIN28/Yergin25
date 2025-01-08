package Assignment1;

public class Sport {
    private String name;

    // Constructor
    public Sport(String name) {
        this.name = name;
    }

    // Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Sport{" +
                "name='" + name + '\'' +
                '}';
    }
}
