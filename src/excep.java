
public class excep {
    public static void main(String[] args) {
        try{
            System.out.println(5/0);
        }
        catch (RuntimeException e){
            System.out.println(e);
        }
    }

}

