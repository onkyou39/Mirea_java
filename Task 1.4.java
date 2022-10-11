//1 lab №4
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int n = scan.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
            sum += arr[i];
        }
        int min = Integer.MAX_VALUE;
        int i = 0;
        do {
            if (arr[i] < min) min = arr[i];
            i++;
        }
        while (i < n);
        int max = Integer.MIN_VALUE;
        i = 0;
        while (i < n) {
            if (arr[i] > max) max = arr[i];
            i++;
        }
        System.out.println("Sum = " + sum);
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
    }
}
