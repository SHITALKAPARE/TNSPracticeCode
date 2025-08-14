package com.finalkeyword;

public class FinalClass {
    void display() {
        System.out.println("This is FinalClass method");
    }

public class FinalClassDemo extends FinalClass {

    void show() {
        System.out.println("Value of a: ");
    }

    public static void main(String[] args) {
        FinalClass obj = new FinalClass();
        obj.display(); // Method from FinalClass
        ((FinalClassDemo) obj).show();    // Method from FinalClass
    }
}
}