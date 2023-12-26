package homework9;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class Pet {
    private String species;
    private String nickname;
    private int age;
    private int trickLevel = new Random().nextInt(100);
    private String [] habits;


    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setTrickLevel(int trickLevel) {
        this.trickLevel = trickLevel;
    }

    public void setHabits(String[] habits) {
        this.habits = habits;
    }

    public String getNickname() {
        return nickname;
    }

    public int getAge() {
        return age;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public String[] getHabits() {
        return habits;
    }

    public void eat (){
        System.out.println("я Їм!"); }

    public void respond(){
        System.out.println("Привіт, хазяїн. Я - " + nickname + ". Я скучив!"); }

    public void foul (){
        System.out.println("Потрібно добре замести сліди...");

    }

    @Override
    public String toString() {
        return species + "{" +
                "nickname='" + nickname + '\'' +
                ", age=" + age +
                ", trickLevel=" + trickLevel +
                ", habits=" + Arrays.toString(habits) +
                '}';
    }

    public Pet(String species, String nickname) {
        this.species = species;
        this.nickname = nickname;
    }

    public Pet(String species, String nickname, int age, int trickLevel, String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public Pet() {}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pet pet)) return false;
        return age == pet.age && trickLevel == pet.trickLevel && Objects.equals(species, pet.species) && Objects.equals(nickname, pet.nickname) && Arrays.equals(habits, pet.habits);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(species, nickname, age, trickLevel);
        result = 31 * result + Arrays.hashCode(habits);
        return result;
    }
}
