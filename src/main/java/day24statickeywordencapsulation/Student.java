package day24statickeywordencapsulation;

//Encapsulation: "Data Hiding(Gizlemek)" demektir.

//Data'yi nicin gizlersiniz? ==> Data'yi dis etkenlerden korumak icin.

//Datyi nasil gizlersin? Acces Modifier'ini private yaparak gizlerim.

//Datayi gizledikten sonra baska Class'lardan okumak istersen ne yaparsin?
//"get method"lar(getter) olusturacak gizledigimiz data'lari okunur hale getirebiliriz.

//Datayi gizledikten sonra baska Class'lardan degistirmek istersen ne yaparsin?
//"set method"lar(setter) olusturacak gizledigimiz data'lari degistirebiliriz.

//Variable'in data type ile get methodun return type'i ayni olmalidir
//"get method"lari isimlendirirken "get + <variable name>" ancak varable'in data type'i boolean ise "is +<variable name>"

public class Student {

    public String stdName="Tom Hanks";
    private String stdId="TH202201";
    private  double gpa =3.8;
    private boolean retired=false;

    public String getStdId() {
        return stdId;
    }

    public double getGpa() {
        return gpa;
    }

    public boolean isRetired() {
        return retired;
    }

    public void setStdId(String stdId) {
        this.stdId = stdId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setRetired(boolean retired) {
        this.retired = retired;
    }
}
