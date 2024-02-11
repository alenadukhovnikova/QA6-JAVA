package homework7;

public class Task3 {
    //Создать класс Конспект. Класс должен содержать следующие поля:

    // ФИО студента; Название предмета; Количество страниц;
    //Год выпуска; Цвет обложки.Название заведения, где учится студент;

    public String studentsName1;
    public String studentsName2;
    public String studentsName3;
    public String nameOfLessons;
    public int countOfPages;
    public int yearOfIssue;
    public String coverColor;
    public String almaMater;

     public void getInfo () {

        System.out.println("ФИО студента:" + studentsName1 + " "+ studentsName2 + " "+ studentsName3);
        System.out.println("Название предмета:" + nameOfLessons);
        System.out.println("Количество страниц:" + countOfPages);
        System.out.println("Год выпуска:" + yearOfIssue);
        System.out.println("Цвет обложки:" + coverColor);
        System.out.println("Где учился студент:" + almaMater);
    }

}