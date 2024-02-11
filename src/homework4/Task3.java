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
        int value = 0;
        while (value <= maxValue) {
            if (value == maxValue) {
            System.out.println("the stock is full");
            break;
        }
        System.out.println("enter value of metall in delivery: ");
        int valueOfMetal = scanner.nextInt();

        if (value+valueOfMetal>maxValue) {
            System.out.println("impossible to add");
            System.out.println("our stock can accept: " + (maxValue - value));
            continue;
        }
            if (valueOfMetal <= 5) {
                System.out.println("impossible to add less than 5");
                System.out.println("our stock can accept: " + (maxValue - value));
                continue;
            }

            value = value + valueOfMetal;
            System.out.println("our stock can accept: " + (maxValue-value));


            }



            }



                //if (valueOfMetal <= maxValue) {
                //System.out.println("our stok can accept: " + (freeValue - valueOfDelivery));
            }







