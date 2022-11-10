package day11loops;

public class ForLoop02 {
    public static void main(String[] args) {
        //bir stringdeki m karakteri haric tum karakterleri yazdiriniz
        String str = "andMromedam";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c != 'm') {
                System.out.print(c);
            }
        }
        System.out.println();
        //2.yol
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'm') {
                continue;//continue: "amaan bosver devam et" demekmis==> loop un icinde bazi degerler icin loop un calismamasini isterseniz continue kullaniniz

            }
            System.out.print(c);
        }
        System.out.println();
       // //example 2: 1 den 100 e kadar 6 ile bölünenler haric tüm tam sayilari ekrana yazdiriniz
       // for (int i = 1; i < 101; i++) {
       //     if (i % 6 == 0) {
       //         continue;
       //     }
       //     System.out.print(i + " ");
       // }

        //example 3=Size verilen bir stringdeki m den önceki karakterleri yazdiriniz
        String str1="Luxemburg";
        for (int i = 0; i <str1.length() ; i++) {
            char c= str1.charAt(i);
            if (c=='m'){
                break;
            }
            System.out.print(c);
        }

    }
}
