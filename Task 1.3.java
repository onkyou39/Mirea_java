//1 lab №3
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
        int average = sum / n;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
    }
}
