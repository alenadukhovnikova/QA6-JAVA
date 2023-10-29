package homework4;

import java.util.Scanner;

public class Task3 {
    // Написать проограмму, условно для склада приема металла. Представим, что склад может хранить определенный вес металла.
    // Пользователь вводит с клавиатуры вес, который может хранится на складе. Дальше пользователь вводит с клавиатуры вес,
    // который условно собирается сдать на склад пользователь. Программа должна после каждой сдачи металла показывать
    // сколько веса еще может принять склад. Если пользователь хочет сдать металла больше чем осталось места на складе,
    // то программа не дает ему это сделать и уведомляет пользователя, о невозможности данной операции.
    // Если пользователь сдает металл весом меньше чем 5, программа тоже предупреждает о невозможности приемки такого
    // малого веса. Программа завершается, когда место на складе закончилось.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter maximum value of metall: ");
        int maxValue = scanner.nextInt();
        System.out.println("enter value of metall in stok: ");
        int stokValue = scanner.nextInt();

        System.out.println("enter value of metall in delivery: ");
        int valueOfMetal = scanner.nextInt();
        while (valueOfMetal <= maxValue-stokValue) {
            int freeValue = maxValue - stokValue;
            if (valueOfMetal > freeValue) {
                System.out.println("the limit reached");
                break;
            }
             freeValue = maxValue - stokValue;
                System.out.println("our stok can accept: " + (freeValue - valueOfMetal));
                System.out.println(freeValue - valueOfMetal);
                System.out.println("enter value of metall in delivery: ");
                int balanceValue = scanner.nextInt();

            while (valueOfMetal > freeValue) {
                break;
            }
             valueOfMetal++;
            System.out.println("the stok is full");
        }
    }
}



