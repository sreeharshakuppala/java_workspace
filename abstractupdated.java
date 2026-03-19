


abstract class Vehicle {

    abstract public void startEngine();
     
    public void fuelType() 
    {
        System.out.println("General fuel Type");
     }

    public void stopEngine()
    {
       System.out.println("Vehicle stopped");
    }
  


}

class Car extends Vehicle {

    @Override
    public void startEngine()
    {

        System.out.println("Car starts with keys/Button");
    }
     @Override
    public void fuelType()
    {

        System.out.println("fuel:Diesel/petrol");
    }
  
    

}

class Bike extends Vehicle {
    
    @Override
    public void startEngine()
    {

        System.out.println("Bike starts with Kick/self start");
    }

    @Override
    public void fuelType()
    {

        System.out.println("fuel:Petrol");
    }
    
   

}
class Truck extends Vehicle
{

    @Override
    public void startEngine()
    {

        System.out.println("Truck starts with heavy-duty ignition");
    }
    @Override
    public void fuelType()
    {

        System.out.println("fuel:Diesel");
    }

    

}



public class abstractupdated

{


    public static void main(String[] args) 
    {
     
         Vehicle vehicle;
        vehicle = new Car();
        vehicle.startEngine();
        vehicle.fuelType();
        vehicle.stopEngine();

        vehicle = new Bike();
        vehicle.startEngine();
        vehicle.fuelType();
        vehicle.stopEngine();

        vehicle = new Truck();
        vehicle.startEngine();
        vehicle.fuelType();
        vehicle.stopEngine();
    }

}