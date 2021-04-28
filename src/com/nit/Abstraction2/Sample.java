package com.nit.Abstraction2;

public abstract class Sample extends Example { // If a class is extended from an Abstract class
                                               // then either we need to implement logic for all
                                               // abstract methods or we need to declare the class as Abstract class.
                        // m2() method implementation changes from PQR to XYZ class hence keeping it as abstract and implementing it further
    @Override
    void m1(){
        System.out.println("m1 from Sample Class");
    }

    abstract void m3();  // we can add another abstract method here, needs to be impl in its child class

}
