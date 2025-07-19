package OOPS;
//like this keyword is used to access current object properties and functions . 
//Super Keyword ->is used to refer immediate parent class object...used to access parent's properties, parent's functions & parent's constructors 
public class SuperKeyword {
    public static void main(String[] args) {
        Horse khatra = new Horse();
        System.out.println(khatra.color);
    }
}

class Animal{
    String color;
    Animal(){
        System.out.println("animal constructor called");
    }
}

class Horse extends Animal{
    Horse(){
        super();
        //It will call animal constructor first and then its on constructor
        //It will set the colour as brown
        super.color="brown";
        System.out.println("Horse constructor called");
    }
}

/*
Output ->
  animal constructor called
  Horse constructor called
  brown
 */