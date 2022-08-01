public class Car extends Vehicle {
    public Car()
    {
        maxspeed=100;
        color="blue";
        wheels=4;
    }
    void print()
    {
        System.out.println(maxspeed+" "+color+" "+wheels);
    }
}
