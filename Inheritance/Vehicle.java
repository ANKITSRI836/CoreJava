public class Vehicle{
    int maxspeed;
    String color;
    int wheels;
    public Vehicle()
    {
        maxspeed=80;
        color="red";
        wheels=4;
    }
     void print()
    {
        System.out.println(maxspeed+" "+color+" "+wheels);
    }
}