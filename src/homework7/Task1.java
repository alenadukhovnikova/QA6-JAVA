package homework7;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    //Написать метод, принимающий в качестве параметра массив целых чисел. И выводит на экран все четные числа списком,
    // a также нечетные числа списком.

    public void evenAndOddNumbers(int[] arrayInt) {
        String evenNumbers = "";
        String oddNumbers = "";

        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] % 2 == 0) {
                evenNumbers = evenNumbers + arrayInt[i] + " ";
            } else {
                oddNumbers = oddNumbers + arrayInt[i] + " ";
                System.out.println("The even numbers are:" + evenNumbers);
                System.out.println("The odd numbers are:" + oddNumbers);

            }
        }
    }}