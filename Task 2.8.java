import java.util.Scanner;

public class Change {
    private static String[] a;
    private static int n;

    public static void main(String[] args) {
      input_array();
      change();
      output_array();
    }

    public static void input_array() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество строк в массиве: ");
        n = sc.nextInt();
        a = new String[n];
        sc.nextLine();
        for(int i = 0; i < n; ++i) {
            System.out.print("Введите "+ (i+1) + " элемент массива: ");
            a[i] = sc.nextLine();
        }
    }
    public static void change() {
        for(int i = 0; i < n/2; ++i) {
            String tmp = a[i];
            a[i] = a[n-i-1];
            a[n-i-1] = tmp;
        }
    }

    public static void output_array() {
        for(int i = 0; i < n; ++i)
            System.out.println(a[i]);
    }
}
