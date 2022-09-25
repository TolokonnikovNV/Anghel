package repCharCount;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RepCharCount repCharCount = new RepCharCount();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(repCharCount.maxRepChar(repCharCount.stringToMap(str)));

    }
}
