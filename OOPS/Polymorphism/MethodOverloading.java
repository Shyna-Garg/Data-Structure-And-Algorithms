package OOPS.Polymorphism;

//Multiple functions with same name but different parameters
public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println(1 + 2);
        System.out.println(1.2 + 2.8);
        System.out.println(1 + 2 + 3);
    }
}

class Calculator {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}