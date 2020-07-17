package LESSON6;

abstract class Animal {
    private final int MAX_RUN_LENGTH = 0;
    private final int MAX_SWIM_LENGTH = 0;
    private final double MAX_JUMP_HEIGTH = 0;

    abstract void run(int length);

    abstract void swim(int length);

    abstract void jump(double height);
}

class Cat extends Animal {
    private final int MAX_RUN_LENGTH = 200;
    private final double MAX_JUMP_HEIGTH = 2;
    @Override
    void run(int length) {
        if ((length >= 0) && (length <= MAX_RUN_LENGTH)) System.out.println("БЕГ: true");
        else System.out.println("БЕГ: false");
    }

    @Override
    void swim(int length) {
        System.out.println("ПЛАВАНИЕ: false");
    }

    @Override
    void jump(double height) {
        if ((height >= 0) && (height <= MAX_JUMP_HEIGTH)) System.out.println("ПРЫЖКИ: true");
        else System.out.println("ПРЫЖКИ: fase");
    }
}

class Dog extends Animal {
    private final int MAX_RUN_LENGTH = 500;
    private final int MAX_SWIM_LENGTH = 10;
    private final double MAX_JUMP_HEIGTH = 0.5;

    @Override
    void run(int length) {
        if ((length >= 0) && (length <= MAX_RUN_LENGTH)) System.out.println("БЕГ: true");
    }

    @Override
    void swim(int length) {
        if ((length >= 0) && (length <= MAX_SWIM_LENGTH)) System.out.println("ПЛАВАНИЕ: true");
        else System.out.println("ПЛАВАНИЕ: false");
    }

    @Override
    void jump(double height) {
        if ((height >= 0) && (height <= MAX_JUMP_HEIGTH)) System.out.println("ПРЫЖКИ: true");
        else System.out.println("ПРЫЖКИ: false");
    }
}

public class HW6 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.run(201);
        cat.swim(1);
        cat.jump(1.9);

        Dog dog = new Dog();
        dog.run(500);
        dog.swim(10);
        dog.jump(0.4);
    }
}
