package operators;

import java.util.Scanner;

public class AritmetikOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        Scanner scanner = new Scanner(System.in);
        String islem = "";

        while (true) {
            System.out.println("Yapmak istediğiniz işlemi seçin (+, -, *, /): ");
            islem = scanner.nextLine();

            if (islem.equals("+")) {
                System.out.println("Toplama: " + toplama(a, b));
            } else if (islem.equals("-")) {
                System.out.println("Çıkarma: " + cikarma(a, b));
            } else if (islem.equals("*")) {
                System.out.println("Çarpma: " + carpma(a, b));
            } else if (islem.equals("/")) {
                System.out.println("Bölme: " + bolme(a, b));
            } else {
                System.out.println("Geçersiz işlem");
            }

            System.out.println("Devam etmek istiyor musunuz? (E/H): ");
            String devam = scanner.nextLine();
            if (devam.equalsIgnoreCase("H")) {
                break;
            }
    }

    }
    public static int toplama(int a, int b) {
    return a+b;
    }
    public static int cikarma(int a, int b) {
        return a-b;
    }
    public static int carpma(int a, int b) {
        return a * b;
    }
    public static int bolme(int a, int b) {
        return a / b;
    }

}
