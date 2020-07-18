package LESSON_3;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String str1="Java";
        String str2="Java";
        String str3= new String("Java");

        /*System.out.println("str1==str2"+str1==str2);
        System.out.println("str1==str3"+(str1==str3));
        System.out.println("str1==str3"+str1.equals(str3));*/
        str2+="g";
        str1+="g";

        double a=2.2;
        double b=5.7;

        /*System.out.println(getX(a, b));
        System.out.println(getX(4, 3, 5, 7, 3, 4, 7));
        System.out.println(getX(a));
        System.out.println(getX((int)a, (int)b));
        getX();*/
//        System.out.println(getX());

        /*BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        String line=reader.readLine();
        System.out.println("Line from console: "+line);*/

        Scanner scanner = new Scanner(System.in);
//        double valueConsole=scanner.hasNextDouble()?scanner.nextDouble():0;
//        System.out.println("Line from console: "+valueConsole);

        Random random=new Random();
        int[] data=new int[10]; //Задаем массив размером 10

        for (int i=0;i<data.length;i++){
            data[i]=random.nextInt(7);//[0;7]
            data[i]=random.nextInt(99)+1;//[1;100]
            data[i]=random.nextInt(35)-5;//[-5;32]
            data[i]=(int)(Math.random()*100)+1;//[1;100]
            data[i]=(int)(Math.random()*38)-5;//[-5;32]

        }

        System.out.println(Arrays.toString(data));

    }

    public static int getX(int a, int b) {
        return a + b;
    }
    public static double getX(double a, double b) {
        return a + b;
    }
    public static int getX(int... other) {
        int sum=0;
        for (int i:other) {
            sum+=i;
        }
        return sum;
    }

    public static double getX(double a) {
        return a*2;
    }
    public static int getX() {
        Scanner scanner = new Scanner(System.in);
        int valueConsole1=scanner.nextInt();
        int valueConsole2=scanner.nextInt();
        return valueConsole1+valueConsole2;
    }



}
