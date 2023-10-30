package homework4;

import java.util.Scanner;

public class Task4 {
    // Первый будет состоять из следующих имен: “Петя”, “Маша”, “Алёна”, “Федя”, “Саша”, “Антон”, “Глеб”.
    // Второй будет содержать следующие значения типа int: 10, 12, 14, 16, 18, 20.
    // Третий будет содержать следующие значения: “школу”, “магазин”, “церковь”, “тренажерный зал”, “кино”, “поликлинику”.
    // Пользователь вводит три числа с клавиатуры, которые будут соответствовать индексам каждого из элементов массивов.
    // Пример1. после ввода 3,2,1: На экране должно вывестись следующее сообщение: “Федя будет идти в магазин в 14:00”
    // Пример2. после ввода 1,2,3: На экране должно вывестись следующее сообщение: “Маша будет идти в тренажерный зал в 14:00”

   public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);
       String[] names = {"Петя", "Маша”,“Алёна”,“Федя”, “Саша”, “Антон”, “Глеб" };
       int[] time = {10, 12, 14, 16, 18, 20};
       String[] place = {"школу”, “магазин”, “церковь”, “тренажерный зал”, “кино”, “поликлинику" };
       String result = "%1$s будет идти в %2$s в %3$d";


       int first;

        do {
            System.out.println("insert number from 0 till 6: ");
            int x = scanner.nextInt();
            first = x;
        }
        while (first < 0 || first > names.length - 1);


        int second;
        do {
            System.out.println("insert number from 0 till 5: ");
           int x = scanner.nextInt();
            second = x;
        }
        while (second < 0 || second > time.length - 1);

        int third;
        do {
           System.out.println("insert number from 0 till 5: ");
           int x = scanner.nextInt();
           third = x;
        }
        while (third < 0 || third > place.length - 1);

        System.out.printf(result,names[first],place[third],time[second]);


}
    }


