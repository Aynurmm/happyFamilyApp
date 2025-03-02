package human;

import Enums.DayOfWeek;
import family.Family;
import pet.Pet;
import java.util.Random;


import java.util.Arrays;
import java.util.Map;
import java.util.Random;

public class Human {
    private String humanName;
    private String humanSurname;
    private int year;
    private int iq;
    private Map<DayOfWeek,String> schedule;
    private Family family;
//    private Pet pet;


    public Human(String humanName, String humanSurname, int year, int iq, Map<DayOfWeek,String> schedule,Family family) {
        this.humanName = humanName;
        this.humanSurname = humanSurname;
        this.year = year;
        this.iq = iq;
        this.schedule = schedule;
        this.family=family;
    }
    public Human(String humanName, String humanSurname, int year, int iq, Map<DayOfWeek,String> schedule) {
        this.humanName = humanName;
        this.humanSurname = humanSurname;
        this.year = year;
        this.iq = iq;
        this.schedule = schedule;
    }
    public Human(String humanName, String humanSurname, int year, Family family){
        this.humanName=humanName;
        this.humanSurname=humanSurname;
        this.year=year;
        this.family=family;

    }

//    public Human(String humanName, String humanSurname,int year, Family family){
//        this.humanName=humanName;
//        this.humanSurname=humanSurname;
//        this.year=year;
//        this.family=family;
//
//    }

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
        if (family != null && family.getPet() != null && !family.getPet().isEmpty()) {
            for (Pet pet : family.getPet()) {
                System.out.println("Hello, " + pet.getNickName() + "!");
            }
        } else {
            System.out.println("I don't have a pet to greet.");
        }
    }

    public void describePet() {
        if (family != null && family.getPet() != null && !family.getPet().isEmpty()) {
            for (Pet pet : family.getPet()) {
                System.out.println("I have a " + pet.getSpices() + ", it's " + pet.getPetAge() + " years old, it's very sly.");
            }
        } else {
            System.out.println("I don't have a pet.");
        }
    }

    public String getHumanName() {
        return humanName;
    }

    public void setHumanName(String humanName) {
        this.humanName = humanName;
    }

    public String getHumanSurname() {
        return humanSurname;
    }

    public void setHumanSurname(String humanSurname) {
        this.humanSurname = humanSurname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public Map<DayOfWeek,String> schedule(){
        return schedule;
    }

    public void setSchedule(Map<DayOfWeek,String> schedule) {
        this.schedule = schedule;
    }


    @Override
    public String toString() {
        StringBuilder scheduleStr = new StringBuilder();
        if (schedule != null && !schedule.isEmpty()) {
            for (Map.Entry<DayOfWeek, String> entry : schedule.entrySet()) {
                scheduleStr.append(entry.getKey()).append(": ").append(entry.getValue()).append("; ");
            }
        } else {
            scheduleStr.append("No schedule");
        }

        return String.format(
                "Human{name='%s', surname='%s', year=%d, iq=%d, schedule={%s}}",
                humanName, humanSurname, year, iq, scheduleStr.toString()
        );
    }



    public void feedPet(boolean itsTimeForFeeding) {
        if (family != null && family.getPet() != null && !family.getPet().isEmpty()) {
            for (Pet pet : family.getPet()) {
                if (itsTimeForFeeding) {
                    System.out.println("I will feed " + humanName + "'s " + pet.getSpices());
                } else {
                    Random random = new Random();
                    int randomNumb = random.nextInt(101);
                    if (pet.getTrickLevel() > randomNumb) {
                        System.out.println("I will feed " + humanName + "'s " + pet.getSpices());
                    } else {
                        System.out.println("I think " + humanName + "'s " + pet.getSpices() + " is not hungry.");
                    }
                }
            }
        } else {
            System.out.println("I don't have a pet to feed.");
        }
    }

}
