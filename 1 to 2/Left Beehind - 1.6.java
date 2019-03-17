import java.util.*;

public class One{


    public static void main(String[] args){
        int num1 = 1;
        int num2 = 1;
        Scanner test = new Scanner(System.in);
        while(num1 + num2 != 0){
            num1 = test.nextInt();
            num2 = test.nextInt();
            if(num1 + num2 != 0){

            if((num1 + num2) == 13){
                System.out.println("Never speak again.");
            }

            else if(num1 < num2){
                System.out.println("Left beehind.");

            }
            else if(num1 > num2){
                System.out.println("To the convention.");

            }
            else if(num1 == num2){
                System.out.println("Undecided.");

            }
            
            
        
            

        }


    
}
}
}


