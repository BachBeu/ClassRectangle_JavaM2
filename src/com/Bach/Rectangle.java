package com.Bach;

public class Rectangle {
    double width, height;

    public Rectangle(){}
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    public double getArea(){
        return width * height;
    }
    public double getPerimeter(){
        return (width + height)*2;
    }
    public String display(){
        return "Rectangll{" + " width = " + width + ", height = " + height + "}";
    }
}
