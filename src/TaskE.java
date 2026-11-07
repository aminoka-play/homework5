import java.util.Scanner;
public class TaskE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        int s = 0;
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 1; i < n; i++) {
            if (a[i] * a[i - 1] >= 0) {
                s++;
            }
        }
        if (s > 0) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }
}
