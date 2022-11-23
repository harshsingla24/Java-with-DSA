package Milestone3.OOPS3_Generics;

import Milestone3.OOPS3_Interface.Vehicle;

public class PairUse 
{  
      public static void main(String[] args) 
    {

        // Its Very Risky Always Specify type if using Generics
        // Pair p=new Pair(100,20);
        // System.out.println(p.getFirst());



        Pair<String,String> pS = new Pair<String,String>("fr", "fc");
        System.out.println(pS.getFirst()+" "+pS.getSecond());
    

        Pair<Integer,Integer> pI =new Pair<Integer,Integer>(10,20);
        System.out.println(pI.getFirst()+" "+pI.getSecond());


        Pair<Double,Double> pD=new Pair<Double,Double>(7.1,3.14);
        System.out.println(pD.getFirst()+" "+pD.getSecond());


        Pair<Character,Character>pC=new Pair<Character,Character>('h','s');
        System.out.println(pC.getFirst()+" "+pC.getSecond());


        Pair<Vehicle,Vehicle> pV=new Pair<Vehicle,Vehicle>(new Vehicle(),new Vehicle());
        System.out.println(pV.getFirst()+" "+pV.getSecond());


        
        Pair<Double,Integer> pDI =new Pair<Double,Integer>(3.14,100);
        System.out.println(pDI.getFirst()+" "+pDI.getSecond());

    } 
    
    
}
