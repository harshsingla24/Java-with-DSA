package Milestone3.OOPS3_Generics;

public class pairofPairs

{
    public static void main(String[] args)
    {

        /*P is main where 
        now 2 more pairs were made with their desired type 1) PInnerLeft  2) PInnerRight 

        now first object of P is pointed to PInnerLeft and second Object of P is pointed to PInnerRight


        */
        Pair<   Pair<String,Character> , Pair<Double,Integer>  >P = new Pair<>();
        
        Pair<String,Character>PInnerLeft=new Pair<>();
        Pair<Double,Integer>PInnerRight=new Pair<>();
        
        P.setFirst(PInnerLeft);
        P.setSecond(PInnerRight);
      
        
        System.out.println("\n");

      
        PInnerLeft.setFirst("Harsh");
        PInnerLeft.setSecond('S');

        PInnerRight.setFirst(24.04);
        PInnerRight.setSecond(2002);
        

        
        
        
        System.out.println(P.getFirst().getFirst()+" "+P.getFirst().getSecond()+"     "+P.getSecond().getFirst()+" "+P.getSecond().getSecond());
        
    }



    

}
