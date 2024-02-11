package homework8;

public class Tree {
    //Создать класс Tree с перегруженными конструкторами.
    // В классе есть Tree есть поля:
    //String type; int height, int coutOfsticks, String colour;
    //Конструктор1 принимающий в параметры String type; int height
    //и присваивающий значение полям coutOfsticks значение 13, colour "Зеленый".

    //Конструктор2 принимающий в параметры int height, int coutOfsticks,
    // String colour и присваивающий значение полю type "пихта".
    //Констуктор по умолчанию 3, который присваивает height = 350, coutOfsticks = 29,сolour = "Желтый".

    // Конструктор4 который принимает в параметры String type,и вызывает внутри себя конструктор 3.

    // Создать в отдельном классе main 4 объекта класса Tree используя 4 созданных конструктора.

    private String type;
    private int height;
    private int countOfSticks;
    private String colour;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getCountOfSticks() {
        return countOfSticks;
    }

    public void setCountOfSticks(int countOfSticks) {
        this.countOfSticks = countOfSticks;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Tree(String type, int height) {
        this.type = type;
        this.height = height;
        this.countOfSticks = 13;
        this.colour = "зеленый";
    }

    public Tree(int height, int countOfSticks, String colour) {
        this.height = height;
        this.countOfSticks = countOfSticks;
        this.colour = colour;
        this.type= "пихта";
    }
public Tree () {
    this.height = 350;
    this.countOfSticks = 29;
    this.colour = "желтый";
}

    public Tree(String type) {
        this.type = type;
        this.height = 350;
        this.countOfSticks = 29;
        this.colour = "желтый";
    }

    public void getInfo () {
    System.out.println("type of the tree is " + type);
    System.out.println("height of the tree is " + height);
    System.out.println("count of sticks are " + countOfSticks);
    System.out.println("colour is " + colour);
}


}
