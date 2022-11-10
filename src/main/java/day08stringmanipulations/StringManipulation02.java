package day08stringmanipulations;

public class StringManipulation02 {
    public static void main(String[] args) {


        // Example 1: Bir Stringdeki space haric kac tane character kullanildigini gösteren kodu yaziniz
        //            "Ali okula gitti." ==>14

        String str = "Ali okula gitti.";

        //replace() method'u bir String'deki herhangi bir karakteri veya karakterleri degistirmek icin kullanilir.
        int num = str.replace(" ", "").length();
        System.out.println(num);

        //example:2 Bir Strinde'ki tum 'a'harflerini 'A''ya ceviriniz.

        String s = "Ankara'nin tasina gözlerimin yasina bak.";
        String s1 = s.replace("a", "A");
        System.out.println(s1);
        //example3: Bir Stringdeki tum kara kelimelerinin yerine '*' koyunuz
        String t = "kara kara dusunme Ankara";
        String yeniT = t.replace("kara", "*");
        System.out.println(yeniT);
        //Example 4: Bir Stringdeki tum sayilari yildiza ceviriniz.
        //          "AC202117004" ==> AC***********
        String stdId = "AC202117004";


        String yeniStdId = stdId.replaceAll("[0-9]", "*");
        System.out.println(yeniStdId);

        /*
        Bir grup datayi ifade eden kodlara "Regex" denir.
        "Regex" Regular Expressions'in kisaltilmis halidir


        1) Tum rakamlari ifade etmek isterseniz ==> [0-9]
        2)Tum kucuk harfler ==> [a-z]
        3) Tum buyuk harfler ==> [A-Z]
        4) Tum harfler ==> [a-zA-Z]
        5)Sesli harfler ==>[aeiouAEIOU]
        6)Space karakteri ==> [ ]
        7)Tum rakamlar ve tum harfler ==>[0-9a-zA-Z]
        8) Tum noktalama isaretleri ==>\\p{Punct} (punctuation mark)

        1)Rakamlar harişc tum karakterler ==> [^0-9]
        2)kucuk harflerr hariç tum karakterler ==> [^a-z]
        3)kucuk harflerr hariç tum karakterler ==> [^A-Z]
        4) Tum harfler haric ==> [^a-zA-Z]
        5)Space haric tum karakterler ==> [^ ]

         */
        //example 5: verilen bir Stringde kullanilan noktalama isaretleri ve rakamlar ve space karakteri haric
        //           tum karakterlerin syisini bulan kodu yaziniz
        String u = "Ali 13 yasinda ,dersem inanma!...";

        int sonuc = u.
                replaceAll("[0-9]", "").
                replace(" ", "").
                replaceAll("\\p{Punct}", "").
                length();
        System.out.println(sonuc);

        //Example 6: Bir password'un gecerli olmadigini asagidaki kurallara gore test eden kodu yaziniz
        //           i)Space haric en az sekiz karakter olmali
        //           ii)En az 1 sembol icermeli
        //           iii)En az 1 rakam icermeli
        //           iv)En az 1 buyuk harf icermeli
        //           v)En az 1 kucuk harf icermeli

        String pwd = "B78c k!";
//           i)Space haric en az sekiz karakter olmali
        boolean first =pwd.replace("","").length()>7;

        //ii)En az 1 sembol icermeli
       boolean second = pwd.replaceAll("[0-9a-zA-Z ]","").length()>0;
        //           iii)En az 1 rakam icermeli
        boolean third =pwd.replaceAll("[^0-9]","").length()>0;
        //           iv)En az 1 buyuk harf icermeli
      boolean fourth=   pwd.replaceAll("[^A-Z]","").length()>0;
        //           v)En az 1 kucuk harf icermeli
      boolean fifth=   pwd.replaceAll("[^a-z]","").length()>0;
      boolean pwdGecerli =first && second && third && fourth && fifth;
      if (pwdGecerli){
          System.out.println("password gecerli");

      }else System.out.println("password gecerli degil");

      //example 7: Bir stringteki noktalama isaretleriinin sayisini gosteren kodu yaziniz
        String cumle = "Sen yapmazsan ,ben ?...";

        int number=cumle.replaceAll("[^\\p{Punct}]","").length();
        System.out.println(number);
        //example 8:vertilen Stringdeki Al ile basliyor ve x ile bitiyorsa ekrana harika yazdiriniz.aski halde normal yazdirin.
        String v ="Kalex";

        boolean baslangic = v.startsWith("Al");
        boolean bitis = v.endsWith("x");

        String result =baslangic && bitis ? "harika ":"normal";
        System.out.println(result);
    }
}
