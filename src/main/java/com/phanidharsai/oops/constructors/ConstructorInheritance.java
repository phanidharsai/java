 /*the below code give output as
null
Dog Constructor
why bcoz as name is initialized only after the object creation is done
new Dog() starts.
Animal constructor runs first.
Animal constructor calls speak().
Due to runtime polymorphism, Dog.speak() is invoked.
But the Dog fields (name = "Bruno") have not yet been initialized because the Dog constructor and
instance field initializers haven't executed.
Therefore, name still has its default value of null.

This is why calling overridable methods from constructors is considered a bad practice in
 production code—it can invoke subclass behavior before the subclass is fully initialized. */


package com.phanidharsai.oops.constructors;
class Animal {

    Animal() {
        speak();
    }

    void speak() {
        System.out.println("Animal");
    }
}

class Dog extends Animal {

    String name = "Bruno";

    @Override
    void speak() {
        System.out.println(name);
    }
}

public class ConstructorInheritance {
      public static void main(String[] args){
          Dog dog = new Dog();
      }
}
