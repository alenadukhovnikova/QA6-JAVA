package homework6;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Game {
    //Даний квадрат 5х5, де програма випадковим чином ставить ціль.
    //• Перед початком гри на екран виводиться текст: All Set. Get ready to rumble!.
    //• Сам процес гри обробляється у нескінченному циклі.
//• Гравцеві пропонується ввести лінію для стрільби; програма перевіряє, щоб було введено число, і введена лінія
//• знаходиться в межах ігрового поля (1-5). У випадку, якщо гравець помилився, пропонує ввести число ще раз.
    //  • Гравцю пропонується ввести стовпчик для стрільби (має проходити аналогічну перевірку).
    //  • Після кожного пострілу необхідно показувати оновлене ігрове поле у консолі. Клітинки, куди гравець вже стріляв, слід зазначити як *.
    //  • Гра закінчується при попаданні в ціль. Наприкінці гри вивести в консоль фразу You have won!, а також ігрове поле.
    //  • Уражену ціль відзначити як x.
//• Завдання повинно бути виконане за допомогою масивів (НЕ використовуйте інтерфейси List, Set, Map).
    //  Приклад виведення в консоль:

    //   [0, 1, 2, 3, 4, 5]
    //   [1, -, *, -, -, -]
    //   [2, -, -, -, -, -]
    //   [3, -, *, -, -, -]
    //   [4, -, -, *, -, -]
    //    [5, -, *, -, -, *]
    public static void main(String[] args) {

        String[][] numbers = {
                {"0", "1", "2", "3", "4", "5"},
                {"1", "-", "-", "-", "-", "-"},
                {"2", "-", "-", "-", "-", "-"},
                {"3", "-", "-", "-", "-", "-"},
                {"4", "-", "-", "-", "-", "-"},
                {"5", "-", "-", "-", "-", "-"},
        };
        for (int k = 0; k < numbers.length; k++) {
            System.out.println(Arrays.toString(numbers[k]));
        }
        ;
        System.out.println("All Set. Get ready to rumble!");
// ставим цель

        Random random = new Random();

        int x = random.nextInt(1, 5);
        int y = random.nextInt(1, 5);

       // System.out.println(x);
       // System.out.println(y);
        while (true) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("insert column number until 1 to 5: ");
            int i = scanner.nextInt();
            System.out.println("insert line number until 1 to 5: ");
            int j = scanner.nextInt();

            String[][] ArrayGoal = numbers.clone();

            if (i > 5 || j > 5) {
                System.out.println("insert number one more time");
            }

            if (i != x || j != y) {
                System.out.println("try one more time");
                ArrayGoal[i][j] = "*";
                for (int k = 0; k < numbers.length; k++) {
                    System.out.println(Arrays.toString(numbers[k])+" ");

                }
                }else{
                    System.out.println("You have won!");
                ArrayGoal[i][j] = "x";
                for (int k = 0; k < numbers.length; k++) {
                    System.out.println(Arrays.toString(numbers[k])+ " ");
                }
                    break;
                }


                for (int k = 0; k < numbers.length; k++) {
                    System.out.println(Arrays.toString(numbers[k])+ " ");
                }

            }
        }
    }



