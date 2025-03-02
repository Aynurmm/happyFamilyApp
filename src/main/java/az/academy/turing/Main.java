package az.academy.turing;

import family.Family;
import human.Human;
import pet.Pet;

public class Main {
    public static void main(String[] args) {
        Pet pet = new Pet("Dog", "Bob", 1, 70, new String[]{"running", "playing"});
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

        String[][] schedule = {
                {"Monday", "Go to school", "Feed Pet"},
                {"Tuesday", "Study Java", "Play football"},
                {"Wednesday", "Read book", "Go to gym"},
                {"Thursday", "Do homework", "Feed Pet"},
                {"Friday", "Watch a movie", "Go to a party"},
                {"Saturday", "Visit grandparents", "Play video games"},
                {"Sunday", "Rest", "Go to the park"}
        };
        Human child = new Human("Zahra", "Aliyeva", 1980, 80, schedule,family);

        mother1.describePet();
        mother1.feedPet(true);
        mother1.greetPet();
        pet.eat();
        pet.foul();
        pet.respond();


    }
}