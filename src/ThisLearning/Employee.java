package ThisLearning;

public class Employee {
    int age = 25;
    public static void main(String[] args){
        Employee e = new Employee();

        int gotAge = e.getAge();

        System.out.println(gotAge);
    }

    public int getAge(){
        return age;
    }


}
