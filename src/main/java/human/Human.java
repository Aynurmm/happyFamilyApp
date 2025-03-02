package human;

import Enums.DayOfWeek;
import family.Family;
import pet.Pet;

import java.util.Arrays;
import java.util.Random;

public class Human {
    private String humanName;
    private String humanSurname;
    private int year;
    private int iq;
    private DayOfWeek[][] schedule;
    private Family family;
//    private Pet pet;


    public Human(String humanName, String humanSurname, int year, int iq, DayOfWeek[][] schedule,Family family) {
        this.humanName = humanName;
        this.humanSurname = humanSurname;
        this.year = year;
        this.iq = iq;
        this.schedule = schedule;
        this.family=family;
    }
    public Human(String humanName, String humanSurname, int year, int iq, DayOfWeek[][] schedule) {
        this.humanName = humanName;
        this.humanSurname = humanSurname;
        this.year = year;
        this.iq = iq;
        this.schedule = schedule;
    }

    public Human(String humanName, String humanSurname, int year) {
        this.humanName = humanName;
        this.humanSurname = humanSurname;
        this.year = year;
    }
    public Human(String humanName, String humanSurname, int year,int iq) {
        this.humanName = humanName;
        this.humanSurname = humanSurname;
        this.year = year;
        this.iq=iq;
    }

    public Human(String humanName, String humanSurname, int year, Human mother, Human father) {
        this.humanName = humanName;
        this.humanSurname = humanSurname;
        this.year = year;

    }

    public Human(){}




    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public void greetPet() {
        if (family != null && family.getPet() != null) {
        System.out.println("hello, " + family.getPet().getNickName());
    }else {
            System.out.println("I don't have a pet to greet.");
        }
    }

    public void describePet() {
        if (family != null && family.getPet() != null) {
            System.out.println("I have " + family.getPet().getSpices() + " its " + family.getPet().getPetAge() + " years old, its very sly");
        }
        else {
            System.out.println("I don't have a pet.");
        }
    }

    @Override
    public String toString() {
        return String.format(
                "Human{name='%s', surname='%s', year=%d, iq=%d, schedule=%s}",
                humanName, humanSurname, year, iq,
                (schedule != null ? Arrays.toString(schedule) : "No schedule")
        );
    }


    public void feedPet(boolean itsTimeForFeeding) {
        if (family != null && family.getPet() != null){
        if (itsTimeForFeeding) {
            System.out.println("I will feed "+humanName+"s "+family.getPet().getSpices());
        }
        else {
            Random random=new Random();
            int randomnumb=random.nextInt(101);
            if (family.getPet().getTrickLevel()>randomnumb){
                System.out.println("I will feed "+humanName+"s "+family.getPet().getSpices());
            }
            else {
                System.out.println("I think " + humanName + "'s " + family.getPet().getSpices() + " is not hungry.");
            }}

        }else {
            System.out.println("I don't have a pet to feed.");
        }


    }
}
