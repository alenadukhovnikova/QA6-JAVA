package homework4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task5 {
    //Есть одномерный массив из 10 элементов, заполнен- ный случайными числами. Пользователь вводит с клавиатуры число.
    // Программа показывает есть ли такое число в созданном до этого массиве.
    public static void main(String[] args) {
        int[] array = new int[10];
        System.out.println(Arrays.toString(array));
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(0, 100);
        }
        System.out.println(Arrays.toString(array));

        System.out.println("enter the number: ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();


        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                x = array[i];
                System.out.println("number in array");
                break;
            } else {

                System.out.println("no number");
            }
        }
    }}