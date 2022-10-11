//1 lab №6
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float temp;
        for (int k = 1; k < 10; k++) {
            temp = 1f / (float) k;
            System.out.printf("%.2f + ", temp);
        }
        temp = 1f / 10;
        System.out.printf("%.2f", temp);
    }
}
