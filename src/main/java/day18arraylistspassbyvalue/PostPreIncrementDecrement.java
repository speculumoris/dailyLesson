package day18arraylistspassbyvalue;

public class PostPreIncrementDecrement {
    public static void main(String[] args) {

        int a=5;
        //post increment
        int b=a++;

        System.out.println(b);
        System.out.println(a);

        //pre increment

        int c=10;

        int d=++c;
        System.out.println(d);//11
        System.out.println(c);

        //Post decrement

        int e=20;

        int f=e--;
        System.out.println(f);//20
        System.out.println(e);//19

        //Pre Decrement
        int h=30;
        int i=--h;



    }
}
