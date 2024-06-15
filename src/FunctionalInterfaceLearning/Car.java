package FunctionalInterfaceLearning;

/*
An interface that contains only one abstract method is called functional interface.
Rule1: Functional interface should and must have only one abstract method
Rule2: Functional interface should be annotated with @FunctionalInterface

You can have unlimited non-abstract methods like default methods,
static methods or private methods for internal uses

 */

@FunctionalInterface
public interface Car {
    public void drive();
}
