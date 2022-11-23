package Milestone3.Recursion_2;

public class codeTowerOfHanoi
{

    public static void TowerOfHanoi(int n, char s, char h,char d)
    {
        if (n==1)
        {
            System.out.println("Move 1st disk from "+s+" to "+d);
            return;
        }
        TowerOfHanoi(n-1,s,d, h);
        System.out.println("Move "+n+"th disk from "+s+" to "+d);
        TowerOfHanoi(n-1,h,s,d);



    }

    public static void main (String[] args)
    {
        TowerOfHanoi(4, 's', 'h', 'd');
        
    }
}
