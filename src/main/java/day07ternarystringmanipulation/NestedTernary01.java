package day07ternarystringmanipulation;

public class NestedTernary01 {
    public static void main(String[] args) {
        /*
        verilen yilin "Leap year"(Artik yil) olup olmadigini kontrol eden kodu yaziniz.
       i)yil 100'e bolunurse 400'e de bolunur==>1600 + 1800-
       ii)yil 100'e bolunmezse 4'e bolunmelidir==>1996+ 2001-
         */
        int year = 2001;


       String leapYear=year % 100 == 0 ? (year % 400 == 0 ? "leap year" : " leap year degil") : (year%4==0 ? "leap year" : "leap year degil");
        System.out.println(leapYear);

        /*
        asagidaki kurallara göre passwordun gecerli olup olmadıgını kontrol eden kodu yaziniz
        i)sekiz karakterden fazla veya sekiz karakter varsa ilk harfi 'i' olmalidir
        ii)sekiz karakterden az karakter varsa ilk harfi 'K' olmalidir
         */
        String pwd = "K2a3";

       String gecerli = pwd.length()<8 ? (pwd.charAt(0)=='i' ? "Gecerli" : "Gecersiz") : (pwd.charAt(0)=='i' ? "Gecerli" : "Gecersiz");


    }

}
