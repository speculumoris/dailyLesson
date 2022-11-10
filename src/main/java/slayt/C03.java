package slayt;

public class C03 {
   /*
                                            DATE && TIME
      Java’da tarih ve zaman icin 3 Class vardir. Bunlardan kendimize uygun olani secip object olusturarak kullanabiliriz.

         1 ) Local Date ==> LocalDate currentDate1 = LocalDate.now();

         LocalDAte currentDate = LocalDate.now();

        //Anlik Tarih
         System.out.println(currentDate)//2022-10-23

         Tarihe süre ekleyeceksek plusDays-plusMonths-plusyears methodlar kullanilir
         Tarihe süre cikartacaksak minusDays-minusMonths-minusYears methodlar kullanilir

         Example: 15 gun 3 ay 2 yil eklemek icin yani sonraki icin

         currentDate.plusDays(15).plusMonths(3).plusYears(2);
         currentDate.minusDays(15).minusMonths(3).minusYears(2);
         currentDate.getYear()//2022
         currentDate.getMonth()//October
         currentDate.getMonthValue()//10
         currentDate.getDayOfMonth()//23
         currentDate.getDayOfWeek()//Sunday

                 //Example 1: Bugunden 789 gun sonra emekli olacaginiza gore, emeklilik tarihini hesaplayan kodu yaziniz
                 LocalDate currentDate2 = LocalDate.of(2022,10,23);
                 LocalDate retireDAte=currentDate2.plusDays(789)
                 System.out.println(retireDAte)//




         2) Local Time ==> LocalTime currentTime1 = LocalTime.now();

         LocalTime currentTime=LocalTime.now();//17:27:33.2345

         zamana bakmak icin yine plus veya minus methodlari kullanilir .Saat icin hour,saniye icin second,dakika icin minute

         currentTime.minusHours(17).minusMinutes(3).minusSeconds(2).minusMilliseconds(1000); gibi
         currentTime.plusHours(17).plusMinutes(3).plusSeconds(2).plusMilliseconds(1000); gibi.

         öğrenmek icin ise get methodunu kullanabiliriz

         currentTime.getMinutes()//27

         LocalTime.now bize bulundugumuz yerin saatini verir.Egeer badka ulkelerin saatini ogrenmek istiyorsaniz sunu kullanabilirsiniz:

         Long jpn=ChronoUnit.now(ZoneId.of("Asia/Tokyo"));



         3) Local Date Time ==> LocalDateTime currentTime1 = LocalDateTime.now();

         Hem saat hem gunu yazdirmak icin kullanabiliriz

         LocalDateTime currentDateTime=LocalDateTime.now();//2022-10-23T12:43:23.2345;

         String e cevirip istedimiz islemi yapabiliriz.

         String crrntDT=currentDateTime.toString();


         4) Data Time Formatter ==> Tarihi veya saati istedigimiz duzene ve arasindaki isaretleri istedigimiz gibi kullanmak icin kullaniriz.
         DataTimeFormatter dtf=DataTimeFormatter.ofPattern("dd/MMM/yyyy");

         M ==> Months ==> kacinci ay oldugunu sadece rakamlarla belli eder ==> 1,2,3,4 vb.
         MM ==> Months ==> kacinci ay oldugunu iki rakamla belli eder ==> 01,02,03,04 vb.
         MMM ==> Months'un ilk uc harfini verir ==> oct,nov,jan,may,jun,jul, vb.
         MMMM ==> Months'un kelime formunda yazdirir ==> october,november,december,july vb.
         m  ==> Minutes ifade eder.

         LocalDate tarih=LocalDate.now();

         System.out.println(tarih) // 2022-10-23
         System.out.println(dtf.format(tarih)) // 23/10/2022 MM ile
         System.out.println(dtf.format(tarih).plusMonths(2)) // 23/Dec/2022 MM ile




         DataTimeFormatter dtf2=DataTimeFormatter.ofPattern("hh:mm:ss");
         LocalTime saat=LocalTime.now();
          hh ==> AM-PM formatinda veya ("hh:mm:ss a")
          HH ==> 24 saat formatinda

          System.out.println(dtf2.format(saat))//05:48:33 ==> hh olursa eger
          System.out.println(dtf2.format(saat))//17:48:33 ==> HH olursa eger


          5) Iki Tarih Arasindaki Zaman FArkini Bulmak icin:

          LocalDate tarih=LocalDate.now();
          LocalDate tarih2=LocalDate.of(1997,5,23)

          //Eger yas bulmak isterseniz

          Long fark=ChronoUnit.MONTHS.between(tarih2,tarih) ===> yeni olandan eskiyi cıkarin ki eksili sonuc bulmayin.
          Period tarih2=Period.between(tarih2,tarih).getYears() ===> yili bulmak isterseniz aradaki fark kadar ==> 24



































    */
}
