package day19datetime;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class DateTime03 {
    public static void main(String[] args) {

        //Example 1: Japonya ile Almanya arasindaki zaman farkini hesaplayan kodu yaziniz
        LocalDateTime alm=LocalDateTime.now(ZoneId.of("Europe/Berlin"));
        LocalDateTime jpn= LocalDateTime.now(ZoneId.of("Asia/Tokyo"));



        Long farkAlmJpn= ChronoUnit.HOURS.between(alm,jpn);
        System.out.println("fark :"+farkAlmJpn);

        //Example 2: Sabit bir tarih olusturunuz
        LocalDate myDate=LocalDate.of(2011, Month.APRIL,13);

        System.out.println(myDate);

        //Java da sabit datalani (Gun isimler, Ay isimleri, Amerika doki eyolet isimleri etc.) depolomak ve gerektiginde kullanmak icin depolar
        //olustururuz. Bu depolara "Enum" denir.

        //Example 3: USA icin "Woow!", UK icin "Big", "CANADA" icin "Cold", "TURKEY" icin "Vatan", "GERMANY" icin "Araba", "RWANDA" icin "Cay"

        Countries country=Countries.RWANDA;

        System.out.println(country);

        switch (country){
            case USA:
                System.out.println("Woow!");
                break;
            case UK:
                System.out.println("big");
                break;
            case CANADA:
                System.out.println("Cold");
                break;
            case TURKEY:
                System.out.println("Vatan");
                break;
            case RWANDA:
                System.out.println("cat");
                break;
            case GERMANY:
                System.out.println("Araba");
                break;
            default:
                System.out.println("Tanimlanmamis ulke");

        }




    }
}
