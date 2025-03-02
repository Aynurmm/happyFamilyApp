package manAndwoman;
import family.Family;
import human.Human;
import pet.Pet;

public class Woman extends Human {
    public Woman(String humanName, String humanSurname, int year, Family family) {
        super(humanName, humanSurname, year, family);
    }
    @Override
    public void greetPet() {
        if (getFamily() != null && getFamily().getPet() != null && !getFamily().getPet().isEmpty()) {
            for (Pet pet : getFamily().getPet()) {
                System.out.println(getHumanName() + " says: Oh my dear " + pet.getNickName() + "! You are so cute!");
            }
        } else {
            System.out.println(getHumanName() + " has no pet to greet.");
        }
    }

    public  void makeUp(){
    System.out.println("I'm putting on my makeup.");
}

}
