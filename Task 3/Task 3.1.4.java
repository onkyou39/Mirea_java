import java.util.Scanner;
import java.util.Random;
public class TaskFour {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        int n = 0;
        System.out.print("Enter n: ");
        n = in.nextInt();
        while( n <= 0){
            if(n <= 0){
                System.out.println("Error! Please enter correct number.");
                n = in.nextInt();
            }
        }
        System.out.println("Array:");
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = rand.nextInt(n);
            System.out.println(arr[i]);
        }
        int[] earr = new int[n];
        System.out.println("Even array:");
        for(int i = 0; i < arr.length; i++){
            if (arr[i] % 2 == 0){
                earr[i] = arr[i];
                System.out.println(earr[i]);
            }
        }
    }
}
