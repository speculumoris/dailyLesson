package day14arraysforeachloop;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {
    //Arrays'lerin icine "primitive data type" leri ve "reference"lar konabilir.
    //Arrays'lerin icinde string yoktur String in adresi vardir==> adrese gidip stringi yazdirir.
    public static void main(String[] args) {

        String str[]=new String[3];
        str[0]="Java";
        str[1]="did";
        str[2]="suprised you";


        System.out.println(Arrays.toString(str));

        //Example 1:String bir Array olusturunuz ve "Tom ve tomdan onceki" tum elemanlari ekrana yazdiriniz
        String arr[]={"Jane","Mark","Christopher","Tom","Ali","Rojda"};

        for (String w:arr){
            System.out.print(w +" ");
            if (w.equals("Tom")){
                break;
            }
        }
        System.out.println();
        //Example 2:String bir Array olusturunuz ve "Tom ve Jane" haric tum elemanlari ekrana yazdiriniz
        String brr[]={"Jane","Mark","Christopher","Tom","Ali","Rojda"};
        for (String w : brr) {
            if (w.equals("Tom")||w.equals("Jane")){
                continue;
            }
            System.out.print(w +" ");
        }
        //example 3: Kullanici ile beraber bir Array olsuturunuz ve icine data ekleyiniz
        //          Bir ogretmenin sinifindaki ogrencilerin isimlerini application a yuklemesini saglayan kodu yazinin
        System.out.println();
        Scanner scan = new Scanner(System.in);
        System.out.println("Kac ogrenci ismi gireceksiniz");
        int numOfStudents= scan.nextInt();

        String names[]=new String[numOfStudents];
        System.out.println("Girisi sonlandirmak icin Q harfine basiniz");

        for (int i =1 ; i <=numOfStudents ; i++) {
            System.out.println("lutfen" + i + ". ogrencinin ilk ismini giriniz");


            String stdName=scan.next();


            if (stdName.equalsIgnoreCase("q")){
                break;
            }
            names[i-1]=stdName;
        }
        System.out.println(Arrays.toString(names));
    }
}
