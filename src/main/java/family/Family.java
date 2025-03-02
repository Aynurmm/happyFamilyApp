package family;

import human.Human;
import pet.Pet;

import java.util.Arrays;

public class Family {
    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;

    public Family(Human mother, Human father, Human[] children, Pet pet) {
        this.mother = mother;
        this.father = father;
        this.children = children;
        this.pet = pet;
    }


    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
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

    public Human[] getChildren() {
        return children;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void addChild(Human child) {
        Human[] newChildren = new Human[children.length + 1];
        for (int i = 0; i < children.length; i++) {
            newChildren[i] = children[i];
        }
        newChildren[newChildren.length - 1] = child;
        this.children = newChildren;
        child.setFamily(this);
        System.out.println(child+"successfully added");
    }

    public boolean deleteChild(int index) {
        if (index < 0 || index >= children.length) {
            return false;
        }
        Human[] newChildren = new Human[children.length - 1];
        int newIndex = 0;
        for (int i = 0; i < children.length; i++) {
            if (i == index) {
                children[i].setFamily(null);
                continue;
            }
            newChildren[newIndex++] = children[i];
        }
        this.children = newChildren;
        return true;
    }

    public int countFamily() {
        if (children != null) {
            return 2 + children.length;
        }
        return 2;
    }

    @Override
    public String toString() {
        return String.format(
                "Family:\n Mother: %s\n Father: %s\n Children: %s\n Pet: %s",
                (mother != null ? mother : "No mother"),
                (father != null ? father : "No father"),
                (children != null && children.length > 0 ? Arrays.toString(children) : "No children"),
                (pet != null ? pet : "No pet")
        );
    }


}
