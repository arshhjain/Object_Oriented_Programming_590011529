import java.util.Scanner;

class duplicate_check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean hasDuplicate = false;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    hasDuplicate = true;
                    break;
                }
            }
            if (hasDuplicate) break;
        }

        if (hasDuplicate) {
            System.out.println("Duplicate elements found.");
        } else {
            System.out.println("No duplicates found.");
        }

        sc.close();
    }
}
