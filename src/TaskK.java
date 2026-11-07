import java.util.Scanner;
public class TaskK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int s = 1;
        for (int i = 1; i < n; i++) {
            if (a[i] != a[i - 1]) {
                s++;
            }
        }
        System.out.print(s);
    }
}
