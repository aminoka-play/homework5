import java.util.Scanner;
public class TaskL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int p = scanner.nextInt();
        int s = 1;
        for (int i = 0; i < n; i++) {
            if (a[i] >= p) {
                s++;
            }
        }
        System.out.print(s);
    }
}
