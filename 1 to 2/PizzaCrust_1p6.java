import java.lang.Math.*;
import java.util.Scanner;
public class PizzaCrust_1p6{

    public static void main(String[] args){
        Scanner test = new Scanner(System.in);
        double a = test.nextInt();
        double b = test.nextInt();
        double total = Math.PI * Math.pow(a, 2);
        double total2 = Math.PI * Math.pow(a - b, 2);


        System.out.println((total2)/(total) * 100);
        



        
    }
}