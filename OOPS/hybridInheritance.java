package OOPS;

     /*                                                   Animal
                                                             |
                                           --------------------------------------------
                                           |                     |                       |
                                          Fish                  Bird                   Mammal
                                     --------------       -------------            -------------
                                     |            |              |                 |            |
                                  Shark        Whale          Peacock             Dog          Human  

                                                    
    */
                                    

public class hybridInheritance {
    public static void main(String[] args) {

        Human siddo = new Human();
        siddo.skinColor = "fare";
        System.out.println(siddo.skinColor);
        Dog tomy = new Dog();
        tomy.breed = "bruno";
        System.err.println(tomy.breed);

    }
}

class Animal {
    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

class Fish extends Animal {
    void swim() {
        System.out.println("swims");
    }
}

class Shark extends Fish {
    int teeth;
}

class Whale extends Fish {
    int fins;
}

class Bird extends Animal {
    void fly() {
        System.out.println("flies");
    }
}

class Peacock extends Bird {
    void dance() {
        System.out.println("dances in rain");
    }
}

class Mammal extends Animal {
    void speak() {
        System.out.println("speaks");
    }
}

class Dog extends Mammal {
    String breed;
}

class Human extends Mammal {
    String skinColor;
}