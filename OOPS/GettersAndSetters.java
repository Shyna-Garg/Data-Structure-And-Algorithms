package OOPS;

public class GettersAndSetters {
    public static void main(String[] args) {
        Pencil p1 = new Pencil();
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
    }
}

//Get - used to return the value
//Set - used to modify the value
//this - this keyword is used to refer to the current object

class Pencil{
private String color;
private int tip;
//Getters
String getColor(){
    return this.color;
}
int getTip(){
    return this.tip;
}
//Setters
void setColor(String color){
    this.color = color;
}
void setTip(int tip){
    this.tip = tip;
}
}

