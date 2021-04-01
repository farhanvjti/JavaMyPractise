package com.nit.Polymorphism;

public class Circle extends Shape{
    private static final double PI = 3.14;
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    void findArea(){
        System.out.println("Circle    Area="+Circle.PI*radius*radius);
    }

}
