package Try;

import java.util.Scanner;
//import java.util.function.BooleanSupplier;

public class panagram 
{


    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        for(int i=0;i<26;i++)
        {
        String str=s.next();
        System.out.println(checkIfPangram(str));
        }
        s.close();
    }
   public static boolean checkIfPangram(String sentence)
    {
        boolean isPangram=false;
        char ch='a';
   //     int ascii=97;
        if(sentence.length()<26)
        {
          isPangram=false;
        }
        else
        {
            for(int i=0;i<sentence.length();i++)
            {
                if(sentence.charAt(i)==ch)
                {
                    isPangram=true;
                    ch+=1;
                    i=0;
                    break;
                }
                else
                {
                    isPangram=false;
                }
            }
            
        }
        return isPangram;
    }

    
}
