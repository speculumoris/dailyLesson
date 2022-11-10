package day25exception;

public class E02 {
    public static void main(String[] args) {
        String arr[]={"Ali","Can","Veli","Han"};
        getElementFromArray(arr,2);
        getElementFromArray(arr,0);
        getElementFromArray(arr,4);

    }
    //Bir String Arrayden index girerek eleman elde edebilmek icin bir method olusturun
    public static void getElementFromArray(String[] arr,int idx){
        System.out.println(arr[idx]);
    }
}
