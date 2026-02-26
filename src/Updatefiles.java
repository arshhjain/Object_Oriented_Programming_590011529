import java.io.FileOutputStream;
import java.io.IOException;

public class Updatefiles{
    public static void main(String[] args){
        try{
            FileOutputStream fil = new FileOutputStream("1.txt");
            String i = "OOPs kyun karun?";
            fil.write(i.getBytes());
            fil.close();
            System.out.println("done");
        }
        catch (IOException e){
            System.out.println(e);
        }

    }
}