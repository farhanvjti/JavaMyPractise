package com.nit.Polymorphism;

public class Rectangle extends Shape{
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }
    void findArea(){
        System.out.println("Rectangle Area="+length*breadth);
    }

}