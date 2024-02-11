package homework9;

import java.util.Arrays;

public class Family {
    private static Human mother;
    private static Human father;
    private static Human [] children;
    private static Pet pet;

    private static String familyName;

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
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

    public Family(Human mother, Human father, String familyName) {
        this.mother = mother;
        this.father = father;
        this.familyName = familyName;
        this.children = new Human[0];
        this.mother.setFamily(this);
        this.father.setFamily(this);
    }
public int countFamily (){
        return 2+ children.length;
}
public void addChild (Human newChild) {
        newChild.setFamily(this);
        Human [] newArray = new Human[children.length+1];
        for (int i=0; i< children.length; i++) {
            newArray[i] = children[i];
        }
        newArray[children.length] = newChild;
        children= newArray;
        }


        public void deleteChild (int index) {
        children[index].setFamily(null);
        children[index] = null;
        Human [] newArray = new Human[children.length-1];
        int counter =0;
            for (int i=0; i< children.length; i++) {
                if (children[i] == null) {
                 continue;
                }
                children[i] = newArray[counter];
                counter++;
            }
            children = newArray;
}

    @Override
    public String toString() {
        return "Family{" +
                "familyName='" + familyName + '\'' +
                ", mother=" + mother +
                ", father=" + father +
                ", children=" + Arrays.toString(children) +
                ", pet=" + pet +
                '}';
    }

    public static String getFamily() {
        return "Family{" +
                "familyName='" + familyName + '\'' +
                ", mother=" + mother +
                ", father=" + father +
                ", children=" + Arrays.toString(children) +
                ", pet=" + pet +
                '}';
    }
}
