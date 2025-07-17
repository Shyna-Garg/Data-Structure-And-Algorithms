package OOPS;

//classes and object

public class basics {
    public static void main(String[] args) {
        //creating pen object named p1
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);

        BankAccount myAcc = new BankAccount();
        myAcc.username = "Shyna";
        // myAcc.password = "1234" -> This gives an error bcz we can't access the password as it is set as private
        myAcc.setPassword("siddo@2003");
    }
}

class Pen {
    // properties od object pen
    String color;
    int tip;

    // functions to change color and size of tip
    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}

class Student {
    // properties of object student
    String name;
    int age;
    float percentage;

    // function for calculating percentage
    void calcPercentage(int phy, int maths, int chem) {
        percentage = phy + maths + chem / 3;
    }

}

// Access Modifiers
class BankAccount {
    public String username;
    private String password;

    // function that can only use to change the password but can't access the real
    // password as it is private
    public void setPassword(String pwd) {
        password = pwd;
    }

}