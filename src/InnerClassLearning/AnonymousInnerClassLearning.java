package InnerClassLearning;

/*
Anonymous class is created on the fly, when we need to change the implementation for a single method
of another classB in ClassA just one time in whole project, then instead of creating
a whole new classC that extends the classA to change the implementation we can create an Anonymous
Class on the fly change the implementation
 */

public class AnonymousInnerClassLearning {
    public static void main(String[] args){
        //If we would like to change the implementation for classB Print method,
        // we can create an Anonymous class and change the implementation on fly as below

        ClassB b = new ClassB() {
            public void print() {
                System.out.println("Updated the print method");
            }
        };

        b.print();
        b.show();

    }
}

class ClassB{
    public void show(){
        System.out.println("Show method is called");
    }
    public void print(){
        System.out.println("Print method is called");
    }
}
