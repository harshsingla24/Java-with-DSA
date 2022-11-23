package Milestone3.OOPS3_Generics;


public class Vehicle implements printInterface
{

    int maxSpeed;
    String company;

    Vehicle()
    {

    }

    Vehicle(int maxSpeed,String company)
    {

        this.maxSpeed=maxSpeed;
        this. company=company;


    }
    

    public void print()
    {
        System.out.println(maxSpeed+" "+company);
    }
}
