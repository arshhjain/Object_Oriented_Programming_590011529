import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Mergefiles{
    public static void main(String[] args){
        try{
            FileOutputStream fil = new FileOutputStream("1.txt", true);
            FileInputStream fil2 = new FileInputStream("2.txt");
            int i;
            while ((i=fil2.read()) != -1){
                fil.write(i);
            }

            fil.close();
            System.out.println("done");
        }
        catch (IOException e){
            System.out.println(e);
        }
    }
}