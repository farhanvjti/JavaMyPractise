package com.nit.Abstraction1;
public abstract class Example {    //Class is abstract -> obj cannot be created
                                        // -> RV of this class can be created.
                                        // -> can create constructor.
                                        // if any one method is abstract, then class is abstract.

    public Example(){

    }

    abstract void m1();       //Method is abstract -> it doesn't hv body,
                             // will hv implementation in subclasses.
}
