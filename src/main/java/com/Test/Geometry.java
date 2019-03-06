package com.Test;

public class Geometry {
    public static void main(String[] args) {
        Drawable [] drawables=new Drawable[3];
        Circle C1 = new Circle("yellow", 22);
        Rectangle R1 = new Rectangle("Red", 3, 33);
        Square Sq1= new Square("black",3);

        drawables[0]=C1;
        drawables[1]=R1;
        drawables[2]=Sq1;
        for(Drawable drawable:drawables){
            drawable.draw();
        }




    }
}
