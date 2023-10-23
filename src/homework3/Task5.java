package homework3;

import java.util.Scanner;

public class Task5 {
    //Написать программу, используя тернарный оператор, где пользователь вводит с клавиатуры два числа и
    // символ – или + или % или / или *. На экран выводится резултат действия над двумя введенными числами.
    // Если пользователь ввел что-то кроме данных символов, то необходимо вывести 0.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите два числа и один из символов действия -, +, %, /, * ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();


        boolean isAddition = scanner.nextBoolean();
        boolean isSubtraction = scanner.nextBoolean();
        boolean isPercent = scanner.nextBoolean();
        boolean isDevision = scanner.nextBoolean();
        boolean isMultiplication = scanner.nextBoolean();

        int additionResult = x+y;
        int subtractionResult = x-y;
        int percentResult = x%y;
        int devisionResult = x/y;
        int multiplicationResult = x*y;
        int nonExistentResult = 0;

        int whatResult = isAddition? additionResult : isSubtraction? subtractionResult : isPercent? percentResult :
                isDevision?  devisionResult :   isMultiplication? multiplicationResult : nonExistentResult;
        System.out.println(whatResult);

    }
}
