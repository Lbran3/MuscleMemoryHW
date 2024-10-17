# MuscleMemoryHW
How do we get rid of an object?
-Java uses automatic garbage collection to manage memory; handles in the background
-Remove all references to the object
-Make reference = null

Create a small demo to understand variable scope in java

-Local variable: it is declared inside the method and only able to be accessed within that method
-Instance Variable: accessed by all methods of its class; declared inside class, outside of the method
-Block Scope: declared inside of an if statement or loop; only accessible inside its block of code


What's the constructor called that has parameters
-Parameterized constructor: meaning it accepts more than one parameters that initiate an object with a specific value
Ex: 
// Parameterized constructor
    public Person(String name, int age) {
        this.name = name; // passed parameter to class's name attribute
        this.age = age;   // Apassed parameter to class's age attribute
    }
