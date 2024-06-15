package LambdaExpressionLearning;

//LambdaExpression --> https://www.youtube.com/watch?v=AdfXQVJVN2w&t=1938s

public class ClassA {
    public static void main(String[]  args){

        //Traditional way is used for calling Audi Implementation, Like implementing the
        // interface and creating the object and then accessing implemented method

        Audi audi = new Audi();
        audi.drive();

        //Anonymous class is used for Benz Implementation
        Car Benz = new Car() {
            public void drive() {
                System.out.println("Driving Benz");
            }
        };
        Benz.drive();

        //LambdaExpression with Anonymous function,
        // but channing the above Anonymous class into Anonymous function

        //LambdaExpressions can be achieved for only functional interface,
        // Since functionalInterfaces will have only one abstract method

        //Even though we don't specify the method,
        //LambdaExpression knows the method to which the implementation is needed,
        // Since Functional Interface will have only one abstract method which needed the implementation

        //Always remember when and "->" Arrow operator is used then it is LambdaExpression

        Car Tesla = () -> {
                System.out.println("Driving Tesla");
            };
        Tesla.drive();






    }
}
