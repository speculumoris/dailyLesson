package day19datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class DateTime01 {
    public static <Localdate> void main(String[] args) {

        //Example 1: "Anlik tarihi"(current date) ekrana yazdiran kodu yaziniz

        LocalDate currentDate=LocalDate.now();
        System.out.println(currentDate);

        //Example 1: "Anlik zamani"(current time) ekrana yazdiran kodu yaziniz
        LocalTime currentTime=LocalTime.now();
        System.out.println(currentTime);

        //Example 3: "Anlik tarihi"(Current date) ve "Anlik zamani(Current Time) ekrana yazdiriniz

        LocalDateTime currentDateTime=LocalDateTime.now();
        System.out.println(currentDateTime);

        //Example 4: Japonya'daki "Anlik tarihi"(Current date) ve "Anlik zamani(Current Time) ekrana yazdiriniz

        LocalDateTime currentDateTimeInJapan =LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(currentDateTimeInJapan);

        //Example 5: Istanbul'daki "Anlik tarihi"(Current date) ve "Anlik zamani(Current Time) ekrana yazdiriniz
        LocalDateTime currentDateTimeInIstanbul =LocalDateTime.now(ZoneId.of("Europe/Istanbul"));
        System.out.println(currentDateTimeInIstanbul);

        //Example 6: Bugunden 789 gun sonra emekli olacaginiza gore, emeklilik tarihini hesaplayan kodu yaziniz

        LocalDate countDate=LocalDate.of(2022,10,21);
        LocalDate retireDate=countDate.plusDays(789);
        System.out.println(retireDate);

        //Example 7: Iki cocugunuzun dogum tarihleri arasindaki farki gun olarak hesaplayan kodu yaziniz

        LocalDate dobAli=LocalDate.of(2005,5,17);
        LocalDate dobVeli=LocalDate.of(2013,2,8);

        //between(dobAli,dobVeli) methodu kullanildiginda daha eski olan tarih önce yazilmalidir
        Long difference=ChronoUnit.DAYS.between(dobAli,dobVeli);
        System.out.println(difference);

        //Example 8:  Istanbul'un fethi ile, Cumhuriyet'in kurulmasi arasinda kac ay oldugunu gösteren kodu yaziniz
        LocalDate istanbulunfethi=LocalDate.of(1453,5,29);
        LocalDate cmhrytinKurulusu=LocalDate.of(1923,10,29);

        Long differ=ChronoUnit.MONTHS.between(istanbulunfethi,cmhrytinKurulusu);
        System.out.println(differ);


        //Example 9: Verilen tarih'in hangi burc oldugunu gosteren kodu yaziniz
        LocalDate myDate=LocalDate.of(1989,5,13);

        int day=myDate.getDayOfMonth();
        int month=myDate.getMonthValue();


        if (day>=21 && month==3){
                System.out.println("Koc");
        }else if (day<=20 && month==4){
            System.out.println("Koc");
        }else if (day>=21&&month==4){
            System.out.println("Boga");
        }else if (day<=20&& month==5){
            System.out.println("Boga");
        }

        //2.yol
        if ((day>=21 && month==3 ||(day<=20 && month==4))){
            System.out.println("Koc");
        }
    }
}
