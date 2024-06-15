package FunctionalInterfaceLearning;

public class User {
    public static void main (String[] args){
        Car c = new Car()
        {
            @Override
            public void drive() {
                System.out.println("Drive for audi is called");
            }
        };
        c.drive();
    }
}
