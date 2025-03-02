package pet;

import java.util.Arrays;

public class Pet {

private String spices;
private String nickName;
private int petAge;
private int trickLevel;
private String[] habits;

    public Pet(String spices, String nickName, int petAge, int trickLevel, String[] habits) {
        this.spices = spices;
        this.nickName = nickName;
        this.petAge = petAge;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }
    public Pet(){

    }
    public Pet(String spices,String nickName){
        this.spices=spices;
        this.nickName=nickName;
    }

    public String getSpices() {
        return spices;
    }

    public void setSpices(String spices) {
        this.spices = spices;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getPetAge() {
        return petAge;
    }

    public void setPetAge(int petAge) {
        this.petAge = petAge;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public void setTrickLevel(int trickLevel) {
        this.trickLevel = trickLevel;
    }

    public String[] getHabits() {
        return habits;
    }

    public void setHabits(String[] habits) {
        this.habits = habits;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "spices='" + spices + '\'' +
                ", nickName='" + nickName + '\'' +
                ", petAge=" + petAge +
                ", trickLevel=" + trickLevel +
                ", habits=" + Arrays.toString(habits) +
                '}';
    }

    public void eat(){
        System.out.println("I am eating");
    }

    public  void respond(){
        System.out.println("Hello owner I am "+this.nickName+". I miss you.");
    }

    public void foul(){
        System.out.println("I need to cover it up");
    }
}
