package day27exceptions;

//Eger Exception Class'a extend ederseniz sizin Class'iniz "Compile Time Exceptions" olur.
public class IllegalGradeException extends Exception {

    public  IllegalGradeException(String message){
        super(message);
    }

}
