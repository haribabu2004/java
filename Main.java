class Example {
    static int staticVariable = 0; // Static variable

    int instanceVariable = 0; // Instance variable

    // Static method
    static void staticMethod() {
        System.out.println("Static method: staticVariable = " + staticVariable);
    }

    // Instance method
    void instanceMethod() {
        System.out.println("Instance method: instanceVariable = " + instanceVariable);
    }
}

public class Main {
    public static void main(String[] args) {
        Example.staticVariable = 10; // Accessing static variable without an object

        Example.staticMethod(); // Calling static method directly

        Example object1 = new Example();
        Example object2 = new Example();

        object1.instanceVariable = 5;
        object2.instanceVariable = 8;

        object1.instanceMethod(); // Calling instance method using object1
        object2.instanceMethod(); // Calling instance method using object2

        Example.staticVariable = 20; // Modifying static variable

        object1.instanceMethod(); // instanceVariable for object1 remains the same
        object2.instanceMethod(); // instanceVariable for object2 remains the same

        Example.staticMethod(); // Static method can still access modified static variable
    }
}
