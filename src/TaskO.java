import java.util.Scanner;
public class TaskO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int s = 0;
        int f = 1;
        while (f == 1) {
            f = 0;
            for (int i = 0; i < n;) {
                int j = i + 1;
                while (j < n && a[j] == a[i]) {
                    j++;
                }
                if (j - i >= 3) {
                    int c = j - i;
                    s = s + c;
                    for (int k = i; k < n - c; k++) {
                        a[k] = a[k + c];
                    }
                    n = n - c;
                    f = 1;
                    break;
                }
                i = j;
            }
        }
        System.out.println(s);
    }
}