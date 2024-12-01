package ru.mirea.leonidova;

public class Ex1 {

    public void exceptionDemo() {
        try {
            System.out.println(2 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }
    }

    public static void main(String[] args) {
        Ex1 example = new Ex1();
        example.exceptionDemo();
    }
}
