package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {

        //kullanicidan bir dikdörtgenin en ve boyunu alip alan ve cevresini hesaplayan kodu yaziniz

        Scanner scan = new Scanner(System.in);
        System.out.print("lutfen dikdörtgenin kısa kenar uzunlugunu giriniz :");
        int kısaKenar = scan.nextInt();
        System.out.print("lutfen dikdörtgenin boy uzunlugunu giriniz :");
        int uzunKenar = scan.nextInt();

        int alan = kısaKenar * uzunKenar;
        int cevre = (kısaKenar * 2)+(uzunKenar*2);

        System.out.println("dikdörtgenin alanı :"+alan);
        System.out.println("dikdörtgenin cevresi :"+cevre);

    }
}
