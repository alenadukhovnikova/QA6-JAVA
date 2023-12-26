package homework10.Task2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    //Создать метод, в котором создается одномерный массив типа int произвольного размера от 1 до 30, в котором
    // каждому элементу массива присваивается произвольное значение от 0 до 30. Данный метод спрашивает у
    // пользователя ввести с клавиатуры индекс случайно сгенерированного массива. Метод возвращает значение типа
    // double, которое получается при делении элемента с указанным индексом пользователя на первый элемент данного массива.

   // Продумать все возможные исключительные ситуации, которые могут возникнуть в данном методе. Для каждой
    // исключительной ситуации создать собственный класс checked исключения. Прописать в методе условия генерации
    // данных исключений, а также указать их в сигнатуре данного метода.
   //Обработку исключения осуществить в сторонеем классе Main в котором нужно вызвать данный метод.

    public static int arrayCreation () {
        Random random = new Random();
        int j = random.nextInt(1, 30);;

        int[] newArray = new int[j];

        int i;
        for (i = 0; i < newArray.length; i++) {
            newArray[i] = random.nextInt(0, 30);
        }
        System.out.println(Arrays.toString(newArray));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert index of the array from 1 to 30 : ");
        int index = scanner.nextInt();
        int x=  newArray[index];
        int y = newArray [0];
        double z = (double) x /y;

        try {
            newArray[0] = 0;
        } catch (java.lang.ArithmeticException e) {
            System.out.println("you can`t divided by zero");}

            try {
                boolean b = newArray[index] > newArray.length;
//if (true );
            } catch (java.lang.ArrayIndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
                System.out.println("Array out of bounds");


        } finally {
            System.out.println("Final");
        }


    return (int) z;
    }
}
