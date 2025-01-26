import java.util.*;
public class Heirarchal {
    public static void main(String [] args)
    {   Cat c1 =new Cat();
        Dog d1=new Dog();
        c1.eat();
        c1.meow();
        d1.eat();
        d1.bark();

    }
    
}

class Animal
{
    public void eat()
    {
        System.out.println("Animal is eating");
    }
}

class Cat extends Animal
{
    public void meow()
    {
        System.out.println("Cat is meowing");
    }
}

class Dog extends Animal
{
    public void bark()
    {
        System.out.println("Dog is barking");
    }
}
