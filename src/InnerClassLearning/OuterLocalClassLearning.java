package InnerClassLearning;


//Local Class

/*
Local variables are variable that defined inside a scope of method instead of class level, Similarly
If a class is defined inside a scope of method then such classes are called LocalClass.
 */
public class OuterLocalClassLearning {
    private int id = 100;
    public static void main(String[] args){
       int salary = 500;

       // LocalClass can only have abstract or final access modifier
       class LocalClass{
            public void print(){
                System.out.println("Print method inside Local Inner clas is called");
            }
        }


        //Object for localClass should be created after a class is defined,
        // Since java executes code line by line
        LocalClass ls = new LocalClass();
        ls.print();

    }
    public void show(){
        System.out.println("Show method is called");
    }
}
