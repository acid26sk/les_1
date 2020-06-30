package LESSON3;

import java.util.Scanner;

public class HomeWork3 {


    public static void main(String[] args) {

        printIf();
        Scanner in = new Scanner(System.in);
        int s=in.nextInt();
        if(s == 1) {
            Object object=new LESSON3.Task1();
        } else{
            Object object=new LESSON3.Task2();
        }
    }

    public static void printIf() {
        System.out.println("\nВыберите задание:");
        System.out.println("1. Угадай число");
        System.out.println("2. Угадай слово");

    }



    /*public static class Task1 {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            do {
                Random r = new Random();
                int x = r.nextInt(9);
                int f;
                System.out.println("Компьютер загадал число от 0 до 9. Попробуйте угадать!");
                System.out.println("Введите число!");

                for (int i = 1; i <= 3; i++) {
                    f = Integer.parseInt(br.readLine());

                    if (f == x) {
                        System.out.println(f + " = " + x + " Вы выйграли!");
                        break;
                    }
                    else if (f > x) System.out.println("Ваше число больше");
                    else System.out.println("Ваше число меньше");

                    if (i == 3) System.out.println("Вы проиграли! загаданное число: " + x);
                }

                System.out.println("Хотите сыграть ещё раз? 1 - ДА / 0 - НЕТ");

                int repeat = Integer.parseInt(br.readLine());
                while ((repeat < 0) || (repeat > 1)) {
                    System.out.println("Введите корректное число: 1 - ДА / 0 - НЕТ");
                    repeat = Integer.parseInt(br.readLine());
                }

                if (repeat == 1) {
                    System.out.println("Запуск новой игры...");
                }
                else {
                    System.out.println("До свидания!");
                    return;
                }
            } while (true);
        }
    }*/

    /*public static class Task2 {
        public static void main(String[] args) throws IOException {
            String[] words = {"apple", "orange", "lemon", "banana", "apricot",
                    "avocado", "broccoli", "carrot", "cherry", "garlic", "grape",
                    "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive",
                    "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin",
                    "potato"};
            String guess = getRandomWord(words);
            String maskedGuess = maskWord(guess);
            System.out.println("Угадайте слово...");

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            while (true) {
                String myWord = br.readLine();
                myWord = maskWord(myWord);
                if (maskedGuess.equals(myWord)) {
                    System.out.println("Вы выйграли! Загаданное слово: " + guess);
                    break;
                } else {
                    StringBuilder maskedResult = new StringBuilder();
                    for (int i = 0; i < maskedGuess.length() - 1; i++) {
                        if (maskedGuess.charAt(i) == myWord.charAt(i)) maskedResult.append(maskedGuess.charAt(i));
                        else maskedResult.append("*");
                    }
                    System.out.println(maskedResult);
                    System.out.println("НЕ ПРАВИЛЬНО! Попробуй снова!");
                }
            }

        }

        static String getRandomWord(String[] s) {
            Random r = new Random();
            return s[r.nextInt(s.length - 1)];
        }

        static String maskWord(String s) {
            String mask = "**********";
            StringBuilder sBuilder = new StringBuilder(s);
            for (int i = sBuilder.length() - 1; i < mask.length() - 1; i++) {
                sBuilder.append(mask.charAt(i));
            }
            s = sBuilder.toString();
            return s;
        }
    }
*/
    /*public static void colorCyan() {
        System.out.println("\u001B[36m");
    }*/

    /*private static void doExit() {
        System.out.println("Вы уверены??? y/n");
        if (in.next().equals("y")) {
            System.exit(0);
        }
    }*/

}