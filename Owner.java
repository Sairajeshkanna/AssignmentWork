class Vheicle  {
      
    
    private int wheel;
    private int gear;
    private int mileage;
    
     
    //Encapsulation
    public void showDisplay() {
        System.out.println("wheels: "+" "+ this.wheel + " Gear: "+" "+this.gear);
    }
 
    public int getwheel() {
        return wheel;
    }
 
    public void setwheel(int wheel) {
        this.wheel = wheel;
    }
 
    public int getgear() {
        return gear;
    }
 
    public void setgear(int gear) {
        this.gear= gear;
    }
 
    public int getMileage() {
        return mileage;
    }
 
    public void setmileage(int mileage) {
        this.mileage = mileage;
    }
 
    
    }
     
//Inherited vehicle class
class Car extends Vheicle {
  public void Start() {
        System.out.println("Car started");
    }
    public void Stop() {
        System.out.println("Car stopped.");
    }
}
class Honda extends Car{
    //@override
public void Start() {
        System.out.println("Bike started");
    }
    public void Stop() {
        System.out.println("Bike stopped.");
    }
}
//Abstaction
abstract class Factory
{
    abstract public void vehicle1() ; 
      abstract public void vehicle2();
}
class Type extends Factory
{
    public void vehicle1() 
    {
        System.out.println("The car is ready");
    }
     public void vehicle2() 
    {
        System.out.println("The Bike is ready");
    }
}
public class Owner {
    public static void main(String[] args) {
   Factory F = new Type();
   F.vehicle1();
  
   Car car1 = new Car();
   car1.Start();
   car1.setgear(5);
   car1.setwheel(4);
   car1.showDisplay();
   car1.Stop();
   
   System.out.println("---------------------------------");
   
   F.vehicle2();
   Honda hon1 = new Honda();
   hon1.Start();
   hon1.setgear(6);
   hon1.setwheel(2);
   hon1.showDisplay();
   hon1.Stop();
   
    }
}