package human;

import pet.Pet;

import java.util.Random;

public class Human {
    private String humanName;
    private String humanSurname;
    private int year;
    private int iq;
    private Pet pet;
    private Human mother;
    private Human father;
    private String[][] schedule;


    public Human(String humanName, String humanSurname, int year, int iq, Pet pet, Human mother, Human father, String[][] schedule) {
        this.humanName = humanName;
        this.humanSurname = humanSurname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.schedule = schedule;
    }

    public Human(String humanName, String humanSurname, int year) {
        this.humanName = humanName;
        this.humanSurname = humanSurname;
        this.year = year;
    }
    public Human(String humanName, String humanSurname, int year,int iq,Pet pet) {
        this.humanName = humanName;
        this.humanSurname = humanSurname;
        this.year = year;
        this.iq=iq;
        this.pet=pet;
    }

    public Human(String humanName, String humanSurname, int year, Human mother, Human father) {
        this.humanName = humanName;
        this.humanSurname = humanSurname;
        this.year = year;
        this.mother = mother;
        this.father = father;
    }

    public Human(){}

    public void greetPet() {
        System.out.println("hello, " + pet.getNickName());
    }

    public void describePet() {
        System.out.println("I have " + pet.getSpices() + " its " + pet.getPetAge() + " years old, its very sly");
    }

    public void feedPet(boolean itsTimeForFeeding) {
        if (itsTimeForFeeding) {
            System.out.println("I will feed "+humanName+"s "+pet.getSpices());
        }
        else {
            Random random=new Random();
            int randomnumb=random.nextInt(101);
            if (pet.getTrickLevel()>randomnumb){
                System.out.println("I will feed "+humanName+"s "+pet.getSpices());
            }
            else {
                System.out.println("I think " + humanName + "'s " + pet.getSpices() + " is not hungry.");
            }
        }
    }
}
