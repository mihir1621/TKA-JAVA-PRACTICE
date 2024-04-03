package com.tka.practice1;

//public class U {
	abstract class Animal {
	    abstract void makeSound(); // Abstract method without implementation
	    
	    void sleep() {
	        System.out.println("Both the Animals are sleeping.");
	    }
	}

	class Dog extends Animal {
	    void makeSound() {
	        System.out.println("Dog is barking.");
	    }
	}

	class Cat extends Animal {
	    void makeSound() {
	        System.out.println("Cat is meowing.");
	    }
	}

	public class Main {
	    public static void main(String[] args) {
	        Animal dog = new Dog();
	        Animal cat = new Cat();
	        
	        dog.makeSound(); // Calls the overridden method in Dog class
	        cat.makeSound(); // Calls the overridden method in Cat class
	        cat.sleep();
	        dog.sleep(); // Calls the method in Animal class
	    }
	}


//}
