package day30_CustomClass;

public class DestinyCharacters {


    public String name;
    public String CharacterType;
    public int power;
    public char Gender;


    public void setInfo(String name, String characterType, int power, char gender) {
        this.name = name;
        this.CharacterType = characterType;
        this.power = power;
        this.Gender = gender;
    }


    public String toString() {
        return "DestinyCharacters{" +
                "name='" + name + '\'' +
                ", CharacterType='" + CharacterType + '\'' +
                ", power=" + power +
                ", Gender=" + Gender +
                '}';
    }
}
