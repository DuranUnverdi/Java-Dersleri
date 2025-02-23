package operators;

import java.util.Scanner;

public class Odev {
    public static void main(String[] args) {

        Odev odev = new Odev();

        String result = odev.odev1();
        System.out.println(result);

        float result2 = odev.odev2();
        System.out.println(result2);

        boolean result3 = odev.odev3();
        System.out.println(result3);

    }

    private static Scanner scanner = new Scanner(System.in);

    public static String odev1() {
        //Bir integer değeri saniye cinsinden alıp, bu değeri dakika ve saniye cinsine çeviren bir program yazınız.

        System.out.println("Hesaplanmasını istediğiniz değeri giriniz  :");
        int totalSaniye = scanner.nextInt();

        int dakika = totalSaniye / 60;
        int saniye = totalSaniye % 60;

        return totalSaniye + " saniye " + dakika + " dakika ve " + saniye + " saniyedir.";
    }

    public static float odev2() {
        //Bir integer değeri Fahrenheit cinsinden alıp, bu değeri Celcius cinsine çeviren bir program yazınız.
        System.out.println("Hesaplanmasını istediğiniz değeri giriniz  :");
        int fahrenheit = scanner.nextInt();
        float celcius = (fahrenheit - 32) * 5 / 9f;
        return celcius;
    }

    public static boolean odev3() {
        //Bir integer değeri yıl cinsinden alıp, bu yılın artık yıl olup olmadığını bulan bir program yazınız.
        System.out.println("Hesaplanmasını istediğiniz değeri giriniz  :");
        int yil = scanner.nextInt();
         if (yil % 4 == 0 || yil % 400 == 0 && yil % 100 != 0) {
            return true;
        }else {
            return false;
        }

    }
}
