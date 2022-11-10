package day12loops;

public class DoWhileLoop01 {
    public static void main(String[] args) {

        int i =1;
        while (i < 1) {

            System.out.println("while loop");
        i++;
        }

        int k=1;
        do {
            System.out.println("do-while yazdir");
            k++;
        }while (k<1);
        ////Example 1: Bir ondalik sayinin ondalik kismindaki rakamlarinin toplamini bulunuz
        double num=24.5673;
        System.out.println(num);
        String str=String.valueOf(num);
        System.out.println(str);

        //regex icin nokta kullandiginizda onune "\\" koyunuz.Yani nokta "\\." su sekilde kullanilir

        String decimalPart=str.split("\\.")[1];
        System.out.println(decimalPart);

        int decimalInt=Integer.valueOf(decimalPart);
        System.out.println(decimalInt);//5673

        int sum=0;

        do {
         sum=sum+decimalInt;
         decimalInt=decimalInt/10;
        }while (decimalInt>0);

        System.out.println(sum);
    }
}
