public class main {
    public static void main(String[] args) {
        Vehicle v=new Vehicle();
        v.print();
        Car c=new Car();
        c.print();
        v=new Car();
        v.print();
    }
}
