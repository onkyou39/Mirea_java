import java.util.Objects;
import java.util.Scanner;
public class Changer {

    private static double yaun = 8.58;
    private static double usdollar = 62.04;
    private static double euro = 60.40;
    private static double belrub = 24.46;
    private static double pound = 69.78;
    private static double zimdollar = 0.1916;


    public static double convert(double r, String v){
        if(Objects.equals(v, "usdollar")){
            return r/usdollar;
        }
        if(Objects.equals(v, "euro")){
            return r/euro;
        }
        if(Objects.equals(v, "pound")){
            return r/pound;
        }
        if (Objects.equals(v, "yuan")) {
            return r / yaun;
        }
        if(Objects.equals(v, "belrub")){
            return r/belrub;
        }
        if(Objects.equals(v, "zimdollar")){
            return r/zimdollar;
        }
        else{
            System.out.println("error");
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input amount of money in rubles: ");
        int n = in.nextInt();
        System.out.print("Choose a currency: ");
        String c = in.next();
        System.out.println("Your amount in " + c + " is " + Changer.convert(n, c));
    }
}
