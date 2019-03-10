package com.selfHome;

public class TwoDFigure {
    public static void main(String[] args) {

        Quadrilaterial ConQu1 = new ConvexQuadrilaterial(10,15,16,12);
        Quadrilaterial Tr1 = new Trapezoid(12,45,4,5);
        Quadrilaterial Par1 = new Parallelogram(12,45);
        Quadrilaterial Rom1=new Rombus(15);
        Quadrilaterial Rec1=new Rectangle(12,45);
        Quadrilaterial Rec2=new Rectangle(14,12);
        Quadrilaterial Sq1=new Square(15);

        ConQu1.area();
        Tr1.area();
        Par1.area();
        Rom1.area();
        Rec1.area();
        Rec2.area();
        Sq1.area();


    }
}
