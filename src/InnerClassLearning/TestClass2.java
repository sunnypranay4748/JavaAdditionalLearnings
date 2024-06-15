package InnerClassLearning;

public class TestClass2 {
    private int id = 10;
    public static void main(String[] args){
        System.out.println("In main method: TestClass2");

        // To create an object for inner class we need call
        // the Object  reference of inner on Outer class object see the below commented code
        /*
        TestClass2 tc2 = new TestClass2();
        TestClass4 tc4 = tc2.new TestClass4();
         */

        // simplified version of the above code
        TestClass4 tc4 = new TestClass2().new TestClass4();
        tc4.show();

    }

    public class TestClass4{
        public void show(){
            //Inner class can access the outer class private variables and methods
            System.out.println(id);
        }
    }

    public class TestClass5{
        //We can create an inner class object in another inner class
        // in traditional way, whereas we cannot do this in the outer class
        TestClass4 tc4 = new TestClass4();
    }
}
