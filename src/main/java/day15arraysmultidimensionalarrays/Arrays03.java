package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {
        //Example 1:Bir Stringteki sesli harflerin sayisini bulan kodu yaziniz
        //          a-e-i-o-u-A-E-I-O-U
        String str="Java ogrenince para kazanmak kolay, ogrenmeyince ne kolay ki.";

        str=str.toLowerCase();

        str=str.replaceAll("\\p{Punct}", "").replace(" ","");
        String harfler[]=str.split("");
        System.out.println(Arrays.toString(harfler));
        int counter=0;
        for (String w:harfler) {
            switch (w){
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    counter++;
                    break;

            }

        }
        System.out.println(counter);


    }
}
