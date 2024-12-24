package Assignment1;

public class Sport {

    public String type;
    public int team_size;
    public String rules;

    public void setValues(String _type, int _team_size, String _rules) {
        type = _type;
        team_size = _team_size;
        rules = _rules;

    }
    public String getValues() {
        return "Type: " + type + "\n Team Size: " + team_size + "\n Rules: " + rules;
    }
}
