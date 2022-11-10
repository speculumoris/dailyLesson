package day19datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime02 {
    public static void main(String[] args) {

        // Example 1: Java'dan aldiginiz date'i "ay/gun/yil" olarak yaziniz
        LocalDate currentDate=LocalDate.now();
        System.out.println(currentDate);

        DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("MM/dd/yyyy");// MM 10 dan kucuk aylari 01,02,03,etc seklinde yazar
        String formattedDate1=dtf1.format(currentDate);
        System.out.println(formattedDate1);

        DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("MMM/dd/yyyy");
        String formattedDate2=dtf2.format(currentDate);
        System.out.println(formattedDate2);

        DateTimeFormatter dtf3=DateTimeFormatter.ofPattern("MMMM/dd/yyyy");
        String formattedDate3=dtf3.format(currentDate);
        System.out.println(formattedDate3);

        DateTimeFormatter dtf4=DateTimeFormatter.ofPattern("M/dd/yyyy");// MM 10 dan kucuk aylari 1,2,3,etc seklinde yazar
        String formattedDate4=dtf4.format(currentDate);
        System.out.println(formattedDate4);

        DateTimeFormatter dtf5=DateTimeFormatter.ofPattern("MM/dd/yy");
        String formattedDate5=dtf5.format(currentDate);
        System.out.println(formattedDate5);

        DateTimeFormatter dtf6=DateTimeFormatter.ofPattern("M/dd/yyyy");// "d" 10 dan kucuk gunleri 1,2,3,etc seklinde yazar.01,02 diye degil
        String formattedDate6=dtf6.format(currentDate);
        System.out.println(formattedDate6);


        //Example 2: Javadan aldiginiz Time'in formatini degistiriniz

        LocalTime myTime=LocalTime.of(4,23,54,2345);
        System.out.println(myTime);//16:23:54.000002345

        DateTimeFormatter dtf7=DateTimeFormatter.ofPattern("HH:mm");//"HH" 24 saat sistemini,"hh" 12 saat sistemini kullanir.
        String formattedMyTime1=dtf7.format(myTime);
        System.out.println(formattedMyTime1);

        DateTimeFormatter dtf8=DateTimeFormatter.ofPattern("hh:mm a");//"HH" 24 saat sistemini,"hh" 12 saat sistemini kullanir.
        String formattedMyTime2=dtf8.format(myTime);
        System.out.println(formattedMyTime2);

    }
}
