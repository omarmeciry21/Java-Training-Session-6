package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        BasicShape s1 = new BasicShape(3,5);
//
//       System.out.println( s1.getArea());

//       Square square1= new Square(5);
//
//       System.out.println("Height: "+square1.height);
//       System.out.println("Width: "+square1.width);
//       System.out.println("Area: "+square1.getArea());
//       System.out.println("Circumference: "+square1.getCircumference());

//       Triangle t1 =new Triangle(5,5);
//       BasicShape s1 = new BasicShape(5,5);
//
//       System.out.println("Triangle Area = "+t1.getArea());
//       System.out.println("Shape Area = "+s1.getArea());
    }
}

class BasicShape{
    double height,width;

    BasicShape(double h,double w){
        height=h;
        width=w;
    }

    double getArea(){
        return height*width;
    }

    double getCircumference(){
        return (height*2) + (width*2);
    }
}

class Triangle extends BasicShape{
    Triangle(double h,double w){
        super(h,w);
    }

    @Override
    double getArea(){
        return 0.5 * height*width;
    }
}

class Square extends BasicShape{
    Square(double length){
        super(length,length);
    }

    @Override
    double getArea(){
        return height*height;
    }

    @Override
    double getCircumference() {
        return 4*height;
    }
}
