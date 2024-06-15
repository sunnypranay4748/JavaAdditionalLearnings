package InnerClassLearning;

/*
Inner class is a class that is placed inside the scope a class. There are 4 types of InnerClasses
   non-Static inner classes, static inner classes
   local classes and anonymous classes/
 */

public class TestClass1 {
    public static void main(String[] args){
        System.out.println("In main methods in testClass1");
    }

    //If we don't give any access modifier then the inner class will have "default" access modifier
    //We can have public, private and protected inner classes

    //Rule: We cannot use main method inside the inner class

    public class TestClass4{

    }

    private class TestClass5{

    }

    protected class TestCalss6{

    }

    //we can also have  static, abstract and final classes

    public static class TestClass7{

    }

    private abstract class TestClass8{

    }

    protected final class TestCalss9{

    }

}

// The below class is a called as another class placed inside one java file
//Rule: we have multiple classes in java rootLevel but there should be only one
// public class which matches with the file name

/*
class TestClass2 {

}
 */
