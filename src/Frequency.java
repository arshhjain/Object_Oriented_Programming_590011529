public class Frequency {
    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 3, 2, 2, 2, 5, 1};
        int target = 2;
        int count = 0;
        for (int i : arr) {
            if (i == target) count++;
        }
        System.out.println("Frequency of " + target + " is: " + count);
    }
}