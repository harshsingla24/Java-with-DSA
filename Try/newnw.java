package Try;

public class newnw 
{

    public static boolean Stringcheck(String str, char ch)
    {
      //  boolean isCharPresent=false;

        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==ch)
            {
         //       isCharPresent=true;
                break;
            }
            
        }
        return false;
    }
    public static void main(String[] args) {

        String str="hlkfjasdbfsjthequickbrownfoxjumpsoverthelazydo";
        System.out.println(Stringcheck(str, 'g'));
        
    }
    
}
