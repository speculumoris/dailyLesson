package slayt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class a {
    public static void main(String[] args) throws IOException {

        String filePath="src/main/java/slayt/or.tst";

        FileInputStream fis=new FileInputStream(filePath);

        int i=0;
        while((i= fis.read())!=-1){
            System.out.print((char)(i));
        }






    }
}
