package day10stringmanipulations;

public class ForLoop01 {
    public static void main(String[] args) {
        //example 1:Ekrana 5 kere "hi" yazdiriniz
        for (int i = 1; i <=5 ; i++) {
            System.out.print("hi ");
        }
        System.out.println(" ");
        //example 3:4 ten 7 ye kadar tum tam sayilari ekrana yazdiran kodu yaziniz.
        for (int i = 4; i <8 ; i++) {
            System.out.print(i+" ");

        }
        System.out.println(" ");
        //example 3:14 den 5 e kadar tüm tam sayilari yazdiriniz
        for (int i = 8; i >4 ; i--) {
            System.out.print(i+" ");
        }
        System.out.println(" ");
        //example 5:14 den 5 e kadar tum cift sayilari yazdiriniz
        for (int i = 14; i >4 ; i-=2) {
            System.out.print(i+" ");
        }
        System.out.println(" ");
        //2.yol
        for (int i = 14; i >4 ; i--) {
            if (i%2==0){
                System.out.println(i);
            }

        }
        System.out.println("");
// example 6=28 den 157 e kadar tum tek sayilari ekrana yazdiran kodu yaziniz
        for (int i = 1; i <10 ; i++) {
            if (i%2!=0){
                System.out.print(i+" ");
            }

        }
        System.out.println("");
        //  example 7=" Java Stringini "J*a*v*a*" ceviren kodu yaziniz
        String a="Java";
        for (int i = 0; i <a.length() ; i++) {
            System.out.print(a.charAt(i)+"*");
        }
        //example 8:" siz ver,ilen tekrarsiz karakterleri ekrana yazdiriniz
        //          "hellooo" ==> ile
        System.out.println(" ");
        String s="hellooo Ali";

        for (int i = 0; i < s.length()-1; i++) {
            char c =s.charAt(i);
            if (s.indexOf(c)==s.lastIndexOf(c)){
                System.out.print(c);
            }

        }
    }
}
