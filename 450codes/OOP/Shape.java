public class Shape {
    double length , breath , rectarea , squarea;
    Shape(double l, double b){
        length = l;
        breath = b;
    }
   public double rectangle(){
         rectarea = length*breath;
         System.out.println("Area of Rectangle: "+ rectarea);
         return rectarea; 
   } 
   public double square(){
        squarea = length*length;
        return squarea;
   }
}
