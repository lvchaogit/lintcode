package com.lc.arithmetic.code454;

public class Rectangle {
    private int width;
    private int height;
    Rectangle(int width,int height){
        this.width = width;
        this.height = height;
    }

    public int getArea(){
        return this.width*this.height;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3,4);
        System.out.println(rectangle.getArea());
    }

}
 