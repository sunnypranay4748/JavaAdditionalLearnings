package AccessingMethodsUsingObject;

public class Student {

    String name = "Pranay Reddy";

    public static void main(String[] args) {

        //The below code is a traditional way of creating an object and accessing method
        //The LHS: reference variable "sd" is created of type Student
        //The RHS: An anonymous object is created and assigned to sd

        //We can also write like this. Create a variable first and assign it later
        //Student sb;
        //sb = new Student();

        /*
        Student sd = new Student();
        sd.greet();
         */

        //We can also call another class object through anonymous objects
        new Student().greet();

        //Most of the time, we create Reference variable and assign the Anonymous object
        // to reference variable to access it or use it multiple time.
        // If we have just one operation of method to use then calling on Anonymous is ideal

        // We can call "new Student().greet();" on multiple methods, but it is waste of memory
        // if not reference to variable, since those will create multiple objects instead of single creation and multiple use


    }

    public void greet(){
        System.out.println("Hie " + name);
    }
}
