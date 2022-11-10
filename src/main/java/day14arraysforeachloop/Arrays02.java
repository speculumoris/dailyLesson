package day14arraysforeachloop;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays02 {
    public static void main(String[] args) {
        // Example 1: [0, 2, 3, 0, 12, 0] put the zeros to the end
        //            [2, 3, 12, 0,  0,  0]

        int original[] = {0, 2, 3, 0, 12, 0};
        int yeni[] = new int[original.length];

        int idx = 0;

        for (int i = 0; i < original.length; i++) {
            if (original[i] != 0) {
                yeni[idx] = original[i];
                idx++;
            }
        }
        System.out.println(Arrays.toString(yeni));


        //Example 2: Bir Array'in icinde herhangi bir elamanin olup olmadigini ve kac kere tekrarlandigini
        // kontrol eden ve gösteren kodu yaziniz

        int arr[] = {2, 1, 2, -3, 2};
        int eleman = 7;

        int counter = 0;

        for (int w : arr) {

            if (w == eleman) {
                counter++;
            }
        }
        if (counter > 0) {
            System.out.println(eleman + " array'de " + counter + " defa var");
        } else {
            System.out.println(eleman +" Array de yok");
        }

        //Example 3: Size verilen cumledeki en uzun verilen kelimeyi bulunuz;
        //          "Java kolaydir calisana, ne kolay ki calismayana" ==>calismayana
        String sentence = "Javaaaaaaaaaaa kolaydir calisana, ne kolay ki calismayana";
        sentence=sentence.replaceAll("\\p{Punct}","");
        System.out.println(sentence);
        String words []=sentence.split(" ");

        Arrays.sort(words, Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(words));//[Java, calisana, calismayana, ki, kolay, kolaydir, ne]harf sirasina göre

        System.out.println(words[words.length-1]);









    }
}
