package day18arraylistspassbyvalue;

public class Varargs01 {
    public static void main(String[] args) {
        /*
        1)Farkli sayilardaki parametrelerle calisabilen bir method
        olusturmak isterseniz "varargs"kullanmalisiniz.
        2)"varargs" arka tarafta "array" kullanir, bu yuzden
        "varargs" larla calisirken "Array"lerle calisiyormus gibi davranabiliriz
        3)"varargs" olusturmak icin "<data typle>...<varargs ismi>"
        veya "<varargs ismi>...<data typle>"
        4)Bir methodda "varargs"in yaninda baska bir parametre kullanilabilir mi?
        "varargs" en sonda olmak sarti ile kullanilir.
        5)Bir methodda birden fazla varargs kullanilabilir mi?
        "varargs" en sonda olmak zorunda oldugundan, birden fazla
         kullanirsaniz en az biri en sonda olamayacaktir. Bu da 4.kural ile celisir.
         */


       int r1=add(2,3);
        System.out.println(r1);

        int r2=add(2,3,4);
        System.out.println(r2);

        int r3=add(2,3,4,5,6,7,8,9,10,11);
        System.out.println(r3);
    }
    //iki sayinin toplamini return eden bir method olusturunuz

   //public static int toplaIkiSayiyi(int a, int b) {
   //    a = 5;
   //    b = 10;
   //    int toplam = a + b;
   //    return toplam;
   //}

   //public static int toplaUcSayiyi(int a, int b, int c) {
   //    a = 5;
   //    b = 10;
   //    c = 15;
   //    int toplam = a + b + c;
   //    return toplam;
   //}

   //public static int topladortSayiyi(int a, int b, int c, int d) {
   //    a = 5;
   //    b = 10;
   //    c = 15;
   //    d = 3;
   //    int toplam = a + b + c + d;
   //    return toplam;
   //}

    //istedigimiz kadar sayiyi toplayabilecegimiz bir method olusturalim

    public static int add(int...a){
        int sum=0;
        for (int w:a){
            sum=sum+ w;
        }
        return sum;
    }
}
