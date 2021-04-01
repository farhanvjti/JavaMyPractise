package com.nit.Polymorphism;

public class Painter {
    public static void main(String[] args) {
       //Circle c = new Circle(2.0);
       //c.findArea();
        Shape s;
        s = new Rectangle(3,4);
        s.findArea();  //findArea() is executed from Rectangle class at RunTime,
                       // based on the obj in s.

        s=new Square(5);
        s.findArea();

        s=new Circle(2);
        s.findArea();
    }
}
/*Note:
1. If method logic is exeucted from diff subclasses based on the ref var.
then it is called as Run time Polymorphism.
2. If method is executed from the same ref var class irrespective
of the object stored in ref var class then it is Compile time Polymorphism.

To acheive Runtime Polymorphism we must use Method Overriding.
MOVR supports Runtime Polymorphism.
Also Inheritance is compulsory to acheive RunTime Polymorphism and to achieve Method Overriding.

***Note:***
If our method is static then whenever such method is called, method is always exected
from the super class and not sub class.

Static method always supports Compile Time Polymorphism.

We cannot achieve MOVR with Static method.

 what happens at compile time: decision of binding the method definition with object happens at compile time.
 what happens at run time: decision taken by JVM to execute method based on the object RV is referring to happens at RunTime.

 If JVM goes with compile time decision then it is Compile Time Polym.
 If JVM takes extra decision at run time then it is Run time Polym.

*/




