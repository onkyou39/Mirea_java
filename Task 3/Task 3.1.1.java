import java.util.Random;

public class TaskOne {
    public static void main(String[] args){
        Random rand = new Random();
        int[] arrayrand = new int[5];
        System.out.println("Array made using Random class:");
        for(int i = 0; i < arrayrand.length; i++) {
            arrayrand[i] = rand.nextInt(1000);
            System.out.println(arrayrand[i]);
        }
        System.out.println("Sorted array made using Random class:");
        for(int i = arrayrand.length-1; i > 0; i--){
            for(int j = 0; j < i; j++){
                if(arrayrand[j] > arrayrand[j+1]){
                    int tmp = arrayrand[j];
                    arrayrand[j] = arrayrand[j+1];
                    arrayrand[j+1] = tmp;
                }
            }
        }
        for(int i = 0;i < arrayrand.length; i++){
            System.out.println(arrayrand[i]);
        }
        double[] arrmath = new double[5];
        System.out.println("Array made using Math.random:");
        for(int i = 0; i<arrmath.length; i++){
            arrmath[i] = Math.random();
            System.out.println(arrmath[i]);
        }
        System.out.println("Sorted array made using Math.random:");
        for(int i = arrmath.length-1; i > 0; i--){
            for(int j = 0; j < i; j++){
                if(arrmath[j] > arrmath[j+1]){
                    double tmp = arrmath[j];
                    arrmath[j] = arrmath[j+1];
                    arrmath[j+1] = tmp;
                }
            }
        }
        for(int i = 0;i < arrmath.length; i++){
            System.out.println(arrmath[i]);
        }
    }
}
