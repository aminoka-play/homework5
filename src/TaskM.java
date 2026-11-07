import java.util.Scanner;
public class TaskM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = i + 1;
        }
        for (int i = a - 1, j = b - 1; i < j; i++, j--) {
            int t = x[i];
            x[i] = x[j];
            x[j] = t;
        }
        for (int i = c - 1, j = d - 1; i < j; i++, j--) {
            int t = x[i];
            x[i] = x[j];
            x[j] = t;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(x[i] + " ");
        }
    }
}
