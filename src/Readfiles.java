import java.io.FileInputStream;
import java.io.IOException;

import static java.lang.System.*;

public class Readfiles{
    public static void main(String[] args){
        try{
            FileInputStream fil = new FileInputStream("1.txt");
            int i;
            while ((i = fil.read()) != -1){
                System.out.println((char)i);
            }
        }
        catch (IOException e){
            System.out.println(e);
        }

    }
}