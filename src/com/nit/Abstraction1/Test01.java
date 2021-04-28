package com.nit.Abstraction1;

public class Test01 {
    public static void main(String[] args) {
        Example e1;
        //e1 = new Example(); -> object of abstract class cannot be instantiated.
        e1 = new Sample();    // Up-Casting (storing subclass object for loose coupling)
        e1.m1();              // Compiler activites:
                              // Compiler checks method in RV class i.e e1 class,
                              // checks m1() method in Example class, it is available.
                              // -> compiler passes it
                              // JVM activites:
                              // JVM goes to Object class looks for the method m1 and executes it :=> RTP

    }
}
