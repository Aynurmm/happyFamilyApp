package AllPets;

import Enums.Species;
import interfaces.Foulable;
import pet.Pet;

import java.util.Set;

public class Dog extends Pet implements Foulable {

    public Dog(String nickName, int petAge, int trickLevel, Set<String> habits) {
        super(nickName, petAge, trickLevel, habits);
        setSpices(Species.DOG);
    }

    @Override
    public void respond() {
        System.out.println("Hello owner I am "+getSpices()+". I miss you.");

    }

    @Override
    public void foul() {
        System.out.println("Hello i am "+getNickName()+", i need to cover it up");
    }
}
