public class StaticDemo {
    static int staticVar = 10;
    int instanceVar = 20;

    public static void main(String[] args) {
        // Accessing static: No object needed
        System.out.println("Static Value: " + staticVar);

        // Accessing non-static: Object is mandatory
        StaticDemo obj = new StaticDemo();
        System.out.println("Non-Static Value: " + obj.instanceVar);
    }
}