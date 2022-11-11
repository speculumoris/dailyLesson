package day29abstractioncollections;

public interface Engine extends Vehicle{

    //Class ---> Interface ==> implements
    //Class ---> Class ==> extends
    //Interface ---> Interface ==>Extends
    //Interface ---> Class ==> mumkun degil


    //interface'lerdeki tum variable'lar otomatik olarak(default) "public" tir
    //interface'lerdeki tum variable'lar otomatik olarak(default) "final" dir
    //interface'lerdeki tum variable'lar otomatik olarak(default) "static" tir

    int price =2000;

    double weight=23.5;

    void run();

}
