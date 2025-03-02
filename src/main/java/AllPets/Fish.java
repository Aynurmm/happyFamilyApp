package AllPets;

import Enums.Species;
import pet.Pet;

import java.util.Set;

public class Fish extends Pet {
    public Fish(String nickName, int age, int trickLevel, Set<String> habits) {
        super(nickName, age, trickLevel, habits);
        setSpices(Species.FISH);
    }

    @Override
    public void respond() {
            System.out.println("Hello owner I am "+getSpices()+". I miss you.");
    }
}
