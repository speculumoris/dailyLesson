package day05Ifstatement;

import java.util.Scanner;

public class IfStatement02 {
    public static void main(String[] args) {
        //example1 : Kullanici gün numarasini girsin kod gün ismini yazsin
        //           2==>Pazartesi          5==> perşembe

        Scanner scan = new Scanner(System.in);
        System.out.println("ltfen gün ismini giriniz");
        byte day = scan.nextByte();

        if (day==1){
            System.out.println("sunday");
        }else if (day==2){
            System.out.println("monday");
        }  else if (day==3){
            System.out.println("tuesday");
        }else if (day==4){
            System.out.println("wednesday");
        }else if (day==5){
            System.out.println("thursday");
        }else if (day==6){
            System.out.println("friday");
        }else if (day==7){
            System.out.println("saturday");
        }else System.out.println("hatali giris yaptiniz");

    }
}
