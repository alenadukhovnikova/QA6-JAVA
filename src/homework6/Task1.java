package homework6;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    // Массив заполняется случайными числами от 0 до 1000.
    //Необходимо создать одномерный массив, состоящий из максимальных значений
    //каждого отдельного массива входящего в двумерный.
    //Новый полученный массив вывести на экран.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert first");
        int first = scanner.nextInt();
        System.out.println("Insert second");
        int second = scanner.nextInt();
        int [][] manyArrays = new int [first][second];

        Random random = new Random();

        for (int i=0; i < manyArrays.length; i++ ) {
            for (int k = 0; k < manyArrays[i].length; k++ ) {
                manyArrays[i][k] = random.nextInt(1000);}

        }
            for (int i=0; i< manyArrays.length; i++) {
                System.out.println(Arrays.toString(manyArrays[i]));
               //System.out.println(Arrays.deepToString(manyArrays));
        }
            int [] arrayResult = new int [manyArrays.length];
            for (int i=0; i< manyArrays.length; i++) {
            int max = manyArrays [i][0];
              for (int k=0; k< manyArrays[i].length; k++){
                  if (manyArrays [i][k]> max){
                      max=manyArrays[i][k];
                  }
              }
              arrayResult[i]=max;
            }
        System.out.println(Arrays.toString(arrayResult));
    }

}
