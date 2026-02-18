class a {
    int sum (int a, int b){
        return a+b;
    }
}
class b extends a{
    @Override
    int sum(int a, int b) {
        return a+b;
    }
}

public class overriding {
    static void main(String[] args) {
        b obj = new b();
        System.out.println(obj.sum(2,3));
    }
}
