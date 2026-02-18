abstract class trial{
    abstract void not_here();
}
class here extends trial{
    void not_here(){
        System.out.println("not_here is here");
    }
}

public class Abstra{
    public static void main(String[] args){
        here v2 = new here();
        v2.not_here();
    }
}