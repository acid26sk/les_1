package LESSON_1;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        name();
        dataType();
        calculate();
        System.out.println(task10and20());
        isPositiveOrNegative();
        System.out.println(isNegative());
        year();
        System.out.println("\n***СПАСИБО ЗА ПРОВЕРКУ***");
    }

    public static void dataType() {
        byte num_1=9;
        short num_2=999;
        int num_3=23675;
        long num_4=234675;
        float num_5=641;
        double num_6=6.18;
        char chr=128;
        boolean wood=true;

        System.out.println("ЗАДАНИЕ №2 \n"+"byte: "+num_1+"\n"+"short: "+num_2+"\n"+"int: "+num_3+"\n"+"long: "+num_4+"\n"+"float: "+num_5+"\n"+"double: "+num_6+"\n"+"char: "+chr+"\n"+"boolean: "+wood);

    }

    public static void calculate () {
        Scanner add = new Scanner(System.in);
        System.out.println ("\nЗАДАНИЕ №3 \nВведите число a:");
        int a = add.nextInt();
        System.out.println ("Введите число b:");
        int b =add.nextInt();
        System.out.println ("Введите число c:");
        int c =add.nextInt();
        System.out.println ("Введите число d:");
        int d=add.nextInt();
        System.out.print("Результат вычислений по формуле a*(b+(c/d)) равен: "+(a*(b+(c/d)))+"\n");
    }

    public static boolean task10and20(){
        Scanner add1=new Scanner(System.in);
        System.out.println ("\nЗАДАНИЕ №4 \nВведите число x1:");
        int x1=add1.nextInt();
        System.out.println ("Введите число x2:");
        int x2=add1.nextInt();
        int x=x1+x2;
        if(x>=10 && x<=20 ){
            return true;
        }else{
        return false;}


    }

    public static void isPositiveOrNegative() {
        Scanner add2=new Scanner(System.in);
        System.out.println ("\nЗАДАНИЕ №5 \nВведите число:");
        int s=add2.nextInt();
        if(s<=0){
            System.out.println("Ваше число отрицательное");
        }else{
            System.out.println("Ваше число положительное");
        }
    }

    public static boolean isNegative (){
        Scanner add3=new Scanner(System.in);
        System.out.println ("\nЗАДАНИЕ №6 \nВведите ваше число:");
        int q=add3.nextInt();

        if(q<=0){
            return true;
        }else{
            return false;}
    }

    public static void name() {
        Scanner add4=new Scanner(System.in);
        System.out.println ("\nЗАДАНИЕ №7 \nВведите ваше имя:");
        String n=add4.nextLine();
        System.out.println("Здравствуй "+n+"\n");
        System.out.println("Проверь пожалуйста моё домашнее задание.\n");
    }

    public static void year() {
        Scanner add5=new Scanner(System.in);
        System.out.println ("\nЗАДАНИЕ №8 \nВведите год:");
        int y=add5.nextInt();
        if(y%4==0&&y%100!=0||y%400==0){
            System.out.println("Год високосный");
        }else{
            System.out.println("Год не високосный");
        }
    }


}
