package AllPets;

import Enums.Species;
import pet.Pet;

import java.util.Set;

public class RoboCat extends Pet {

    public RoboCat(String nickName, int petAge, int trickLevel, Set<String> habits) {
        super(nickName, petAge, trickLevel, habits);
        setSpices(Species.ROBOCAT);
    }

    @Override
    public void respond() {
            System.out.println("Hello owner I am "+getSpices()+". I miss you.");
    }
}
