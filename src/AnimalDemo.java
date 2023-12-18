/*
Q2 -> Write a Java program that demonstrates method overriding by creating a superclass
       called Animal and two subclasses called Dog and Cat.
      ● The Animal class should have a method called makeSound(), which
          simply prints "The animal makes a sound."
      ● The Dog and Cat classes should override this method to print
           "TheCat/The dog meows/barks" respectively.
      ● The program should allow the user to create and display objects of each
        class.*/
class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

class Dog extends Animal {

    public void makeSound() {
        System.out.println("The dog barks.");
    }
}

class Cat extends Animal {
    public void makeSound() {
        System.out.println("The cat meows.");
    }
}

public class AnimalDemo {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal();
        Dog myDog = new Dog();
        Cat myCat = new Cat();
        genericAnimal.makeSound();
        myCat.makeSound();
        myDog.makeSound();


    }
}
