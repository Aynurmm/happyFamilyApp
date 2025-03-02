package manAndwoman;

import family.Family;
import human.Human;
import pet.Pet;

public final class Man extends Human {
    public Man(String humanName, String humanSurname, int year, Family family) {
        super(humanName, humanSurname, year, family);
    }
    @Override
    public void greetPet() {
        if (getFamily() != null && getFamily().getPet() != null && !getFamily().getPet().isEmpty()) {
            for (Pet pet : getFamily().getPet()) {
                System.out.println(getHumanName() + " says: Hey buddy! How’s my best friend " + pet.getNickName() + "?");
            }
        } else {
            System.out.println(getHumanName() + " has no pet to greet.");
        }
    }

    public void repairCar(){
        System.out.println("I'm fixing my car.");
    }
}
