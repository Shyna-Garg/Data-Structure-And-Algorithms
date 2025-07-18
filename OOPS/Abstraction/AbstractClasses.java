package OOPS.Abstraction;

//Abstract - hiding all the unnecessary details and showing only the important parts to the user.
//absraction means khyaal ..mtlb hm idea de dete h chizo ki implementation ka isme pr implement ni krte..implement krti h ane wali uski subclasses
//difference in encapsulation and abstraction --
//Encapsulation - wrappping up of data & methods under a single unit. It also implements data hiding using access modifiers.
/*Abstract class -> .we cannot create an instances/objects of abstract class
                    . can have both abstract and non-abstract methods
                    .can have constructors
                    .abstract keyword is used
 If we craete a abstract method in abstract class, we will just define the method but not implement it there. we will use this function in 
 its subclasses and implement there.                              
*/

public class AbstractClasses {
    public static void main(String[] args) {
        //creating object for horse class...we cannot create object for animal class, it will give error bcz it is abstract class 
        Horse khatra = new Horse();
        khatra.eat();
        khatra.walk();
        //Mustang object creating
        Mustang vinay = new Mustang();
        
    }
}

abstract class Animal{
    //constructor
    Animal(){
        System.out.println("animal constructor is called");
    }
    //non-abstract method
    void eat(){
        System.out.println("animal eats");
    }
    //abstract method
    abstract void walk();
    //we will not implement it here..subclasses of this class Animal will use it and implement it
}

class Horse extends Animal{
    //constructor
    Horse(){
        System.out.println("horse constructor called");
    }
    //this extended class horse of animal can use that function and implement it
    void walk(){
        System.out.println("horse walks with 4 legs");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor called");
    }
}

/*
Output -->  
animal constructor is called
horse constructor called
animal eats
horse walks with 4 legs
animal constructor is called
horse constructor called
Mustang constructor called
*/ 