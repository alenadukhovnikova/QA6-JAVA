package homework9;

public class Main {
    public static void main(String[] args) {

        Human father = new Human("Roman", "Popov", 36);
        Human mother = new Human("Natalia", "Popov", 35);
        Human child1 = new Human("Viktor", "Popov", 10, mother, father);
        Human child2 = new Human("Anna", "Popov",7, mother, father);
        Human child3 = new Human("Alisa", "Popov",4, mother, father);

        Human father1 = new Human("Alex", "Nechaev", 40);
        Human mother1 = new Human("Sofia", "Nechaev", 38);
        Human child1a = new Human("Mia", "Nechaev", 17, mother1, father1);
        Human child2a = new Human("Max", "Nechaev", 13, mother1, father1);
        Human child3a = new Human("Svitlana", "Nechaev", 8, mother1, father1);


        Pet cat = new Pet("Cats","Pushok", 10, 50, new String[]{"eat", "play", "sleep"});
        Pet cat2 = new Pet("Cats","Pelmien", 5, 80, new String[]{"eat", "play", "sleep"});
        Pet dog = new Pet("Dogs","Kory", 6, 80, new String[]{"eat", "play", "sleep"});
        Pet dog2 = new Pet("Dogs","Ronaldo", 11, 50, new String[]{"eat", "play", "sleep"});


        child1.setPet(cat);
        child2.setPet(cat2);
        child3a.setPet(dog);
        child3.setPet(dog2);


        Family popov = new Family(mother, father, "Popov");
        System.out.println(popov.countFamily());
        popov.addChild(child1);
        popov.addChild(child2);
        popov.addChild(child3);
        System.out.println("Размер семьи "+ popov.countFamily());

        Family nechaev = new Family(mother1, father1, "Nechaev");
        System.out.println(nechaev.countFamily());
        nechaev.addChild(child1a);
        nechaev.addChild(child2a);
        System.out.println("Размер семьи "+ nechaev.countFamily());



        System.out.println(father);
        System.out.println(child2);

       popov.deleteChild(1);
        System.out.println("Размер семьи "+ popov.countFamily());


        System.out.println(mother.getFamily());
        System.out.println(father.getFamily());
        System.out.println(mother.getFamily().equals(father.getFamily()));


        System.out.println("Размер семьи "+ popov.countFamily());
        System.out.println(child2.getFamily());
        System.out.println(child2.getName());
    }
}