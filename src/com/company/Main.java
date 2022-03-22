package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
       dog Dog = new dog("Rex");
       System.out.println(Dog.makeSound());
       Dog.setAge(5);
       System.out.println(Dog.getAge());
       Dog.setBreed("koker");
        System.out.println(Dog.getBreed());

        Cat Cat = new Cat("Komo");
        System.out.println(Cat.makeSound());
        Cat.setAge(5);
        System.out.println(Cat.getAge());
       Cat.setBreed("British");
        System.out.println(Cat.getBreed());

    }
}
