package com.prowings.oops.inheritance;

class Fruit {
    void grow() {
        System.out.println("This fruit grows.");
    }
}

class Apple extends Fruit {
    void taste() {
        System.out.println("The apple tastes sweet.");
    }
}

public class Main {
    public static void main(String[] args) {
        Apple myApple = new Apple();
        myApple.grow();  // Inherited method
        myApple.taste(); // Subclass method
    }
}

