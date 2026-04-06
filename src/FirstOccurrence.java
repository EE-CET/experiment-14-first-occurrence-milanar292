import java.util.Scanner;

public class FirstOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int position = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] == k) {
                position = i + 1;
                break;
            }
        }

        System.out.println(position);
    }
}
