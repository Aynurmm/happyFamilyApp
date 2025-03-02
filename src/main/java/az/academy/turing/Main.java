package az.academy.turing;

import AllPets.Dog;
import AllPets.DomesticCat;
import AllPets.Fish;
import AllPets.RoboCat;
import Enums.DayOfWeek;
import family.Family;
import human.Human;
import interfaces.Foulable;
import manAndwoman.Man;
import manAndwoman.Woman;
import pet.Pet;
import Enums.Species;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Human child1 = new Human("Sara", "Smith", 2005);
        Human child2 = new Human("Shahin", "Smith", 2008);
        ArrayList<Human>childrenlist=new ArrayList<>();
        childrenlist.add(child1);
        childrenlist.add(child2);

        LinkedHashSet<String> habitsList=new LinkedHashSet<>();
        habitsList.add("running");
        habitsList.add("playing");


        Pet pet1 = new Fish("fish", 1, 70, habitsList);
        Pet pet = new Dog("Bob", 2, 70, habitsList);
        Pet pet2=new RoboCat("Mira",1,50,habitsList);
        Pet pet3=new DomesticCat("Lisa",2,60,habitsList);
        List<Pet>petList=new ArrayList<>();
        petList.add(pet1);
        petList.add(pet);
        petList.add(pet2);
        petList.add(pet3);

        Human mother = new Human("Aliya", "Aliyeva", 1955);
        Human father = new Human("Ali", "Aliyev", 1953);
        Family family = new Family(mother, father, childrenlist, Collections.singletonList(petList.get(0)));
        Human mother1 = new Human("Elza", "Korola", 1980, family);
        Human father1 = new Human("John", "Smith", 1970);
        Family family1 = new Family(mother1, father1, childrenlist, Collections.singletonList(petList.get(1)));
        Human man = new Man("Alex", "Greyd", 2001, family1);
        Human woman = new Woman("Laura", "Swift", 2003, family1);
        Woman woman1 = new Woman("Lidia", "Jenner", 2004, family);
        Man man1 = new Man("Scott", "Mccal", 2001, family);

        Map<DayOfWeek, String> schedule = new HashMap<>();
        schedule.put(DayOfWeek.MONDAY, "Voleyball");
        schedule.put(DayOfWeek.TUESDAY, "Read book");
        schedule.put(DayOfWeek.WEDNESDAY, "Work on project");
        schedule.put(DayOfWeek.THURSDAY, "Meeting with friends");
        schedule.put(DayOfWeek.FRIDAY, "Cinema");
        schedule.put(DayOfWeek.SATURDAY, "Going to course");
        schedule.put(DayOfWeek.SUNDAY, "Sleeping");
        schedule.forEach((day, activity) -> System.out.println(day + " : " + activity));


        man.greetPet();
        woman.greetPet();
        woman1.makeUp();
        man1.repairCar();


        family1.addChild(new Human("Ayan", "Smith", 2010));
        System.out.println(family1.deleteChild(1));
        System.out.println(family1.countFamily());
        System.out.println(family1);

        mother1.describePet();
        mother1.feedPet(true);
        mother1.greetPet();
        pet.eat();
        pet.respond();
        Foulable myDog = new Dog("Charlie", 1, 85, habitsList);
        myDog.foul();


    }
}