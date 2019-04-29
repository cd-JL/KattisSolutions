import java.util.Scanner;

public class EraseSecurely_1p7
{
    
    public static void main(String [ ] args)
    {
        Scanner s = new Scanner(System.in);

        int loops = s.nextInt();
        s.nextLine();
        StringBuilder test = new StringBuilder(s.nextLine());
        StringBuilder temp = new StringBuilder(s.nextLine());
        
  
        for(int i = 0; i < loops; i ++)
        {
           
            for(int b = 0; b < temp.length(); b++)
            {
                
                if(temp.charAt(b) == '1')
                {
                    temp.setCharAt(b, '0');
                }
                else
                {
                    temp.setCharAt(b, '1');
                }
            }
            
        }
    s.close();

        if(temp.toString().equals(test.toString()))
        {
        
            System.out.println("Deletion succeeded");
        }
        else
        {
         
            System.out.println("Deletion failed");
        }


    }
}
