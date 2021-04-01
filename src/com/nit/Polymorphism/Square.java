package com.nit.Polymorphism;
//Square Class extending from Shape
public class Square extends Shape{
    private double length;
    public Square(double length){
        this.length = length;
    }
    void findArea(){
        System.out.println("Square    Area="+length*length);
    }

}
