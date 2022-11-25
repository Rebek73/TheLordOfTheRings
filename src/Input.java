package src;

import java.util.Scanner;

public class Input {
    private static Scanner scanner = new Scanner(System.in);

    public static String getString(String question) {
        String ask = null;
        System.out.print(question);
        ask = scanner.next();
        return ask;
    }

    public static int getInteger(String question) {
        int ask = 0;
        System.out.print(question);
        ask = scanner.nextInt();
        return ask;
    }
}