package day18arraylistspassbyvalue;

public class MethodOverloading01 {
    /*
    MEthod Overloading nasil yapilir?
    1)Method
    2)Method parametreleri farkli olmalidir
      i)Parametre sayilari degistirilebilir
      ii)Parametrelerin data tipini degistirebilirsiniz
      iii)Parametrelerin yerlerini degistierbilirsiniz

    3)Method İsmi + Parametreler = Method Signature (Methodun İmzasıdır)
         Method Signature dışında ne değiştirirseniz değiştirin
         Java o methodları farklı kabul etmez.

     */

    public static void main(String[] args) {
        add(3,5);
    }
    public static void add(int a,int b){
        System.out.println("a"+(a+b));
    }
    public static void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
    public static void add(int a,double b){
        System.out.println(a+b);
    }
    public static void add(double a,int b){
        System.out.println(a+b);
    }
}
