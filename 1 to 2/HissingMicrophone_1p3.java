import java.util.Scanner;


public class HissingMicrophone_1p3{

    public static void main(String[] args){
        Scanner string = new Scanner(System.in);
        String word = string.nextLine();
        char letter = 's';
        boolean count = false;

        for(int i = 0; i < word.length(); i++){
            if(letter == word.charAt(i) && i != word.length() - 1){
                if (letter == word.charAt(i + 1)){
                    count = true;
                    break;
                }
            }
        }
        if(count == true){
            System.out.println("hiss");
        }
        if(count == false){
            System.out.println("no hiss");
        }




    }
}