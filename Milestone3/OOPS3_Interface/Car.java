package Milestone3.OOPS3_Interface;

public class Car extends Vehicle implements VehicleInterface,CarInterface
{

    @Override
    public boolean isMotorized() {
        
        
        return false;
    }

    @Override
    public String CompanyName() {
     
        
        return "Ferrari";
    }

    @Override
    public int numGears() {
       
        
        return 5;
    }


    
}
