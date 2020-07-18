package LESSON_3;

import java.io.IOException;
import java.util.Scanner;


public class Task4 {
    public void task4() throws IOException {
        System.out.println("Введите количество чисел фибоначи: ");
        Scanner scanner = new Scanner(System.in);
        int p = scanner.nextInt();

        int[] arr = new int[p];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < p; ++i) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        int fib = 0;
        for (int i = 0; i < p; ++i) {
            if (p == 0) {
                System.out.println("0");
            } else if (p == 1) {
                System.out.println("4");
            } else {
                fib = fib + (arr[i] * 4);
                System.out.print(arr[i] + " ");
            }

        }

        System.out.println("\n Сумма периметров всех квадратов Фибоначи " + fib);
    }


}
