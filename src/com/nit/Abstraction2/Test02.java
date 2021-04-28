package com.nit.Abstraction2;

public class Test02{
    public static void main(String[] args) {
        Example e1; //LC and RP =>
                    // if we create object of class
                    // where we declared the methods then we can refer it to different subclasses, then LC+RP

        //e1 = new Example(); //Abstract class cannot be instantiated
        //e1 = new Sample();  //Abstract class cannot be instantiated
        //object of that class should be created where all methods implementations are present

        e1 = new PQR();
        e1.m1();
        e1.m2();
        //e1.m3(); // CE: m3 method is declared in Sample class
        //methods can be invoked using object of either the class in which they
        //are declared or from its subclass.
        //m3 is declared in Sample class so can't be invoked using super class Example RV.
        ((Sample) e1).m3(); //m3-declared class DOWNCAST
        ((PQR) e1).m3();    //subclass of m3-declared class DOWNCAST

        //Rules of Downcast: downcast type should be either RV->object-type
        //                   or downcast type Sample -> object type is subclass of Sample.

        e1 = new XYZ();
        e1.m1();
        e1.m2();
        ((XYZ) e1).m4();


    }

}
