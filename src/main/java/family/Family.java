package family;

import human.Human;
import pet.Pet;

import java.util.*;

public class Family {
    private Human mother;
    private Human father;
    private ArrayList<Human> children;
    private List<Pet> pet;

    public Family(Human mother, Human father, ArrayList<Human> children, List<Pet> pet) {
        this.mother = mother;
        this.father = father;
        this.children = children;
        this.pet =  pet;
    }


    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
    }

    public Family(Human mother, Human father, List<Pet> pet) {
        this.mother = mother;
        this.father = father;
        this.pet = pet;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public ArrayList<Human> getChildren() {
        return children;
    }

    public List<Pet> getPet() {
        return pet;
    }


    public void setChildren(ArrayList<Human> children) {
        this.children = children;
    }



    public void setPet(List<Pet> pet) {
        this.pet = pet;
    }

    public void addChild(Human child) {
        children.add(child);
        child.setFamily(this);
        System.out.println(child + "successfully added");
    }

    public boolean deleteChild(int index) {
        if (index < 0 || index >= children.size()) {
            return false;
        }
        children.remove(index).setFamily(null);
        return true;
    }

    public boolean deleteChild(Human child) {
        for (int i = 0; i < children.size(); i++) {
            if (children.get(i).equals(child)) {
                return deleteChild(i);
            }
        }
        return false;
    }


    public int countFamily() {
        if (children != null && !children.isEmpty()) {
            return 2 + children.size();
        }
        return 2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Family family = (Family) o;
        return Objects.equals(mother, family.mother) && Objects.equals(father, family.father) && Objects.equals(children, family.children) && Objects.equals(pet, family.pet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mother, father, children, pet);
    }

    @Override
    public String toString() {
        return String.format(
                "Family:\n Mother: %s\n Father: %s\n Children: %s\n Pet: %s",
                (mother != null ? mother : "No mother"),
                (father != null ? father : "No father"),
                (children != null && !children.isEmpty() ? children.toString() : "No children"),
                (pet != null ? pet : "No pet")
        );
    }


}
