package pet;

import Enums.Species;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;

public abstract class Pet {

    private Species spices;
    private String nickName;
    private int petAge;
    private int trickLevel;
    private Set<String> habits;

    public Pet(String nickName, int petAge, int trickLevel, Set<String> habits) {
        this.nickName = nickName;
        this.petAge = petAge;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public Pet() {

    }

    public Pet(Species spices, String nickName) {
        this.spices = spices;
        this.nickName = nickName;
    }

    public Species getSpices() {
        return spices;
    }

    public void setSpices(Species spices) {
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

    public Set<String> getHabits() {
        return habits;
    }

    public void setTrickLevel(int trickLevel) {
        this.trickLevel = trickLevel;
    }

    public Set<String> habits() {
        return habits;
    }

    public void setHabits(Set<String> habits) {
        this.habits = habits;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "spices='" + spices + '\'' +
                ", nickName='" + nickName + '\'' +
                ", petAge=" + petAge +
                ", trickLevel=" + trickLevel +
                ", habits=" + habits.toString() +
                '}';
    }

    public void eat() {
        System.out.println("I am eating");
    }

    public abstract void respond();


}
