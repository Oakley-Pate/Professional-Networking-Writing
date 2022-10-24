/*
Oakley Pate
CS 232-001
CS 232-Lab5
Uses classes in java to record information about different pets
10/10/2022
*/

public class Main{
    public static void main(String[] args){
        
        //CAT
        Cat cat = new Cat("Cat", "Janice", "08/03/2015", "John", 10.00, "Female", "White");
                
        System.out.println(cat.getTag());
        System.out.println(cat.toString());
        
        //Calling methods in Cat class
        cat.speak();
        cat.scratch_post();
        cat.ignore_owner();
        cat.climb_trees();
        cat.sleep();
        
        System.out.println('\n');
        
        
        //DOG
        Dog dog = new Dog("Dog", "Kevin", "12/17/2019", "Candice", 25.00, "Male", "Brown");
        
        System.out.println(dog.getTag());
        System.out.println(dog.toString());
        
        //Calling methods in Dog class
        dog.speak();
        dog.roll_over();
        dog.play_dead();
        dog.sit();
        dog.whine();
        dog.wag_tail();
        
        System.out.println('\n');
        
        
        //BIRD
        Bird bird = new Bird("Bird", "James", "08/15/2020", "Jeremy", 0.03, "Male", "Yellow");
        
        System.out.println(bird.getTag());
        System.out.println(bird.toString());
        
        //Calling methods in Bird class
        bird.speak();
        bird.sing();
        bird.fly();
        bird.eat_bird_seed();
        
        System.out.println('\n');
        
        
        //TURTLE
        Turtle turtle = new Turtle("Turtle", "Bartholomew", "05/12/1970", "Timothavius", 75.00, "Male", "Green");
        
        System.out.println(turtle.getTag());
        System.out.println(turtle.toString());
        
        //Calling methods in Turtle class
        turtle.speak();
        turtle.crawl();
        turtle.hide_in_shell();
        turtle.swim();
    }
}
