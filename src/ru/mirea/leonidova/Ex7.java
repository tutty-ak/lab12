package ru.mirea.leonidova;
import java.util.Scanner;
public class Ex7 {
    public void getKey() {
        Scanner myScanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Kлюч: ");
                String key = myScanner.nextLine();
                printDetails(key);
                break;
            } catch (Exception e) {
                System.out.println("Ошибка: " + e.getMessage());
                System.out.println("Попробуйте еще раз");
            }
        }
        myScanner.close();
    }

    public void printDetails(String key) throws Exception {
        if (key.isEmpty()) {
            throw new Exception("null ключ");
        }
        System.out.println("Данные ключа:" + key);
    }

    public static void main(String[] args) {
        ru.mirea.leonidova.Ex7 demo = new ru.mirea.leonidova.Ex7();
        demo.getKey();
    }
}
