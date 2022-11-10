package day26exceptions;

import java.util.Scanner;

public class Exceptions04 {
    public static void main(String[] args) {
        int yas=0;
        printAge(yas);

    }
    public static void printAge(int yas){
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen yasinizi giriniz");
        yas= scan.nextInt();
        if (yas<0|| yas>200) {
            throw  new IllegalArgumentException("Yas negatif ve 200'den buyuk olamaz");
        }
        System.out.println(yas);

    }
}
