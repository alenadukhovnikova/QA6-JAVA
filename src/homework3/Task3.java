package homework3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        //При помощи тернарного оператора необходимо получить разность двух чисел введенных с клавиатуры, и всегда
        //отнимать от большего меньшее. Вывести эту разность в консоль.
        Scanner variable = new Scanner(System.in);
        System.out.println("введите два числа:");
        int x = variable.nextInt();
        int y = variable.nextInt();
        boolean result1 = x>y;

        int action = result1? x-y : y-x;
        System.out.println("разность даух чисел равна : " + action);

    }
}
