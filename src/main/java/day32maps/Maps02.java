package day32maps;

import java.util.HashMap;

public class Maps02 {
    public static void main(String[] args) {
        //size verilen bir kelimedeki harflerin kacar kere yazildigini gosteren odu yaziniz

        String kelime ="abbcaa";
        String harf[] =kelime.split("");
        HashMap<String,Integer>gorunum=new HashMap<>();

        for (String w : harf) {
            gorunum.merge(w, 1, Integer::sum);
        }
        System.out.println(gorunum);
    }
}
