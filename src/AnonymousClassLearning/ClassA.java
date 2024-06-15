package AnonymousClassLearning;



public class ClassA {
    public static void main(String[] args){

        //We can also create an anonymous class on the fly for an interface,
        // We are not create an object for interface,
        // We are creating an object of an anonymous class of type interface.
        // We can always refer to an interface  like
        // "List is an interface" List<> ls = new LinkedList<>()
;
        Car c1 = new Car() {
            public void drive() {
                System.out.println("Drive method is called");
            }
        };

        //The scope of the Anonymous class just limited to the main method itself in the above.
        // If you want an implementation of interface just in one method of class differently
        // instead of creating a whole new class for implementation you can use an Anonymous class
    }
}
