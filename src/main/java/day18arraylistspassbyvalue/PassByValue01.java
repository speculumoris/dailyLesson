package day18arraylistspassbyvalue;

public class PassByValue01 {

    public static void main(String[] args) {

        /*
        1)Java variable'larin orijinal degerlerini korumak ister
        2)Variable methodlar icinde kullanildigidna,Java method2un icine orijinal degerleri koymaz,o degerin kopyasini uretir
        ve method'a o kopyayi yollar.Method kopya ustunde degisiklik yapar
        dolayisiyla variable'in orijinal degeri korunmus olur.
        Bu sisteme "Pass By Value" debir.
        Note: Java "Pass By value"kullanir.
        Note:Bazi programlama dilleri orijinal degeri koruma altina almamistir.
        Bu isi developer'lara birakmistir bu tarz diller" Pass by reference" kullanir
         */

        int x=12;
        System.out.println(x);

        //static method olan "main method" un icindeki hersey
        //static olmalidir

        change(x);
        System.out.println(x);

        int ucret=100;
        indirim(ucret);
        System.out.println(ucret);

    }


    public static void change(int a){
        System.out.println(a*3);
    }

    //void disindaki return type'larda method body'si icinde
    // return keyword kullanilmalidir
    public static  int indirim(int gomlekUcreti){
       return gomlekUcreti-10;
    }
}
