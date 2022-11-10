package day26exceptions;

public class Exceptions02 {
    public static void main(String[] args) {
       char ch1= getCharFromString("Java",2);
        System.out.println(ch1);
        char ch2= getCharFromString("Selenium",8);
        System.out.println(ch2);//StringIndexOutOfBoundsException:Eger bir string'den bir karakter veya karakterler alirken olmayan bir index kullanilirsa
                                                                // "StringIndexOutOfBoundsException" alinir;
    }
    public static char getCharFromString(String str,int idx){
        char c =' ';
       try {
           c=str.charAt(idx);
       }catch (StringIndexOutOfBoundsException e){
           System.out.println("Index ile ilgili bir problem olustu. " +e.getMessage() );
           e.printStackTrace(); //detayli "log" icin

       }
       return c;
    }
}
