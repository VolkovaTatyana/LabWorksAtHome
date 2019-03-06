package com.dbulat;

 class Phone {
//String phoneN="123456789";
//void setPhoneN() {
//String phoneN;
//    phoneN = "987654321";
//}
//}
//class TestPhone{
//    public static void main(String[] args) {
//        Phone p1=new Phone();
//        p1.setPhoneN();
//        System.out.println(p1.phoneN);
//    }
//}
//public class A{
private int x;
public void setX(int x){
    x=x;
}
public int getX(){
    return x;
}

     public static void main(String[] args) {
         Phone p=new Phone();
         p.setX(5);
         System.out.println(p.getX());
     }
}