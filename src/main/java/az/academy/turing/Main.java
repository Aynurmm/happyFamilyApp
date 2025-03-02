package az.academy.turing;

import Enums.DayOfWeek;
import family.Family;
import human.Human;
import pet.Pet;
import Enums.Species;

public class Main {
    public static void main(String[] args) {
        Pet pet = new Pet(Species.DOG, "Bob", 1, 70, new String[]{"running", "playing"});
        Human mother = new Human("Aliya", "Aliyeva", 1955);
        Human father = new Human("Ali", "Aliyev", 1953);
        Human mother1=new Human("Elza","Korola",1980,80);
        Human father1= new Human("John", "Smith", 1970);
        Family family=new Family(mother,father);
        Human child1 = new Human("Sara", "Smith", 2005);
        Human child2 = new Human("Shahin", "Smith", 2008);
        Human[]children={child1,child2};
        Family family1=new Family(mother1,father1,children,pet);

        family1.addChild(new Human("Ayan","Smith",2010));
        System.out.println(family1.deleteChild(1));
        System.out.println(  family1.countFamily());
        System.out.println(family1);

        String[][] schedule=new String [7][2];
        schedule[DayOfWeek.MONDAY.ordinal()] = new String[]{"Monday", "Voleyball"};
        schedule[DayOfWeek.TUESDAY.ordinal()] = new String[]{"Tuesday", "Read book"};
        schedule[DayOfWeek.WEDNESDAY.ordinal()] = new String[]{"Wednesday", "Work on project"};
        schedule[DayOfWeek.THURSDAY.ordinal()]=new String[]{"Thursday","Meeting with friends"};
        schedule[DayOfWeek.FRIDAY.ordinal()]=new String[]{"Friday","Cinema"};
        schedule[DayOfWeek.SATURDAY.ordinal()]=new String[]{"Saturday","Going to course"};
        schedule[DayOfWeek.SUNDAY.ordinal()]=new String[]{"Sunday","Sleeping"};


        System.out.println("Weekly Schedule: ");
        for (DayOfWeek dayOfWeek:DayOfWeek.values()){
            System.out.println(dayOfWeek.name() + ":"+ schedule[dayOfWeek.ordinal()].toString());
        }

        mother1.describePet();
        mother1.feedPet(true);
        mother1.greetPet();
        pet.eat();
        pet.foul();
        pet.respond();


    }
}