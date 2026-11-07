import java.util.Scanner;
public class TaskJ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int m = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] > m) {
                m = a[i];
            }
        }
        System.out.print(m);
    }
}
