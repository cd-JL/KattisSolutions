import java.util.Scanner;
public class OneChickenPerPerson_1p7{
    public static void main(String[] args){
    Scanner ass = new Scanner(System.in);
    int num1 = ass.nextInt();
    int num2 = ass.nextInt();

    if(num1 < num2){
        if((num2 - num1) == 1){
        System.out.println("Dr. Chaz will have " + (num2 - num1) + " piece of chicken left over!");
    }
        if((num2 - num1) != 1){
        System.out.println("Dr. Chaz will have " + (num2 - num1) + " pieces of chicken left over!");
    }
}
    if(num1 > num2){
        if((num1 - num2) == 1){
            System.out.println("Dr. Chaz needs " + (num1 - num2) + " more piece of chicken!");
        }
        if((num1 - num2) != 1){
            System.out.println("Dr. Chaz needs " + (num1 - num2) + " more pieces of chicken!");
        }
    }
}
}