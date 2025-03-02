package az.academy.turing;

import human.Human;
import pet.Pet;

public class Main {
    public static void main(String[] args) {
        Pet pet = new Pet("Dog", "Bob", 1, 70, new String[]{"running", "playing"});
        Human mother = new Human("Aliya", "Aliyeva", 1955);
        Human father = new Human("Ali", "Aliyev", 1953);
        Human mother1=new Human("Elza","Korola",1980,80,pet);

        String[][] schedule = {
                {"Monday", "Go to school", "Feed Pet"},
                {"Tuesday", "Study Java", "Play football"},
                {"Wednesday", "Read book", "Go to gym"},
                {"Thursday", "Do homework", "Feed Pet"},
                {"Friday", "Watch a movie", "Go to a party"},
                {"Saturday", "Visit grandparents", "Play video games"},
                {"Sunday", "Rest", "Go to the park"}
        };
        Human child = new Human("Zahra", "Aliyeva", 1980, 80, pet, mother, father, schedule);

        mother1.describePet();
        mother1.feedPet(true);
        mother1.greetPet();
        pet.eat();
        pet.foul();
        pet.respond();


    }
}