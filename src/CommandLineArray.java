public class CommandLineArray {
    public static void main(String[] args) {
        System.out.println("Stored String Array:");
        for (String s : args) {
            System.out.print(s + " ");
        }
    }
}