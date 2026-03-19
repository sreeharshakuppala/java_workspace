





abstract class Vehicle 
{
    abstract void start();

    void fuel() {
        System.out.println("vehicle needs fuel");
    }

}

class Bike extends Vehicle 
{
    void start() 
    {
        System.out.println("Bike starts with kick");
    }

    void fuel() 
    {
        System.out.println("this bike will run with petrol");
    }

}

class Car extends Vehicle {
      
    void start()
      {
          System.out.println("car sarts with self");
      }

      void fuel()
      {
        System.out.println("car runs with diesel");
      }
   
}

    

public class abstra
{
    public static void main(String[] args)
    {

        Vehicle b1 = new Bike();
        Vehicle b2 = new Car();
        b1.start();
        b1.fuel();
        b2.start();

    }
}
