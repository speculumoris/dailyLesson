package day10stringmanipulations;

public class StringManipulations01 {
    public static void main(String[] args) {
        String a = "Java kolaydir";

        //startsWith("kola",5) kodu ilk bes karakterden sonraki String'e bakar ve a String'in "kola" ile baslayip baslamadigini kontrol eder.
        //"kola" ile basliyorsa "true" baslamiyorsa "false" return eder
        boolean b = a.startsWith("kola", 5);
        System.out.println(b);
        // replaceFirst("a","*") kod String deki ilk "a" yi "*" e cevirir.
        //replace("a","*")kod String deki tum "a" yi "*" e cevirir
        String c = a.replaceFirst("a", "*");
        System.out.println(c);

        //concat() method'u iki tane String'i birbirine yapistirmaya yarar.
        //"Concatenation" islemi iki turlu yapilabilir; i)+ ile ii)concat() ile
        //Java bir islem icin method uretmisse o method'u kullanmak "best practice" dir.
        String d = a.concat(" Anladin mi?");
        System.out.println(d);//Java kolaydir. Anladin mi?

        //trim() methodu bir String'in baştaki ve sondaki space karakterlerini siler.
        //aradaki "space" karakterlerine dokunmaz.
        String e = "    Tom Hanks   ";
        System.out.println(e);//"   Tom Hanks   "

        String f = e.trim();
        System.out.println(f);//"Tom Hanks"

        String h = "Java";
        String i = "java";
        //h.compareTo(i); kod iki tane String'i alfabetik(lexicographic) olarak karsilastirir.
        //Buyuk harf e duyarlidir.
        //Buyuk harf kucuk harf'e duyarli olmasini istemezseniz h.compareToIgnoreCase(i); kullanabilirsiniz.
        //h.compareTo(i); kodda "h" nin alphabetik sirasindan "i" nin alfabetik sirasi cikarilir.
        int k = h.compareTo(i);
        System.out.println(k);

        //a.repeat(5); kodu a string'ini yan yana 5 kere yapistirir.
       String n= a.repeat(3);
        System.out.println(n);

    }
}
