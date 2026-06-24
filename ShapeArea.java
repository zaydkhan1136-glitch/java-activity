public class ShapeArea{
 double area(double r){return 3.14*r*r;}
 double area(double l,double b){return l*b;}
 double area(double base,double height,boolean t){return 0.5*base*height;}
 public static void main(String[] args){
  ShapeArea s=new ShapeArea();
  System.out.println("Circle Area = "+s.area(5));
  System.out.println("Rectangle Area = "+s.area(10,5));
  System.out.println("Triangle Area = "+s.area(8,6,true));
 }
}
