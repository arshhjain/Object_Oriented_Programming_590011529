class calcs{
    int sum(int a, int b, int c){
        return a+b+c;
    }
    int sum(int a, int b){
        return a+b;
    }
    float sum(float a, int b){
        return a+b;
    }
}
public class overloading {
    static void main(String[] args) {
        calcs addis = new calcs();
        System.out.println(addis.sum(1,2,3));
        System.out.println(addis.sum(1,2));
        System.out.println(addis.sum(1.5f,2));
    }
}
