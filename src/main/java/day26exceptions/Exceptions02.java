package day26exceptions;

public class Exceptions02 {
    public static void main(String[] args) {
       //char ch= karakteriAl("medium",8);
        //System.out.println(ch);
        char ch1= karakteriAl("medium1",8);
        System.out.println(ch1);//StringIndexOutOfBoundsException:Eger bir string'den bir karakter veya karakterler alirken olmayan bir index kullanilirsa
                                                                // "StringIndexOutOfBoundsException" alinir;
    }
    public static char karakteriAl(String str,int idx){
        char a =' ';
       try {
           a=str.charAt(idx);
           System.out.println("bir problem olusursa okudugunuz satır devreye girmez " +
                   "Java problemle karsılasınca direkt Catch bloga atlar.");
       }catch (StringIndexOutOfBoundsException e){
           System.out.println("Index'le alaklı bir problem var. " +e.getMessage() );
           e.printStackTrace(); //detayli "log" icin
           System.err.println("Index'le alaklı bir problem var. ");

       }
       return a;
    }
}
