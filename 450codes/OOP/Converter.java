public class Converter extends Shape{
    double inch , feet;
    Converter(double l, double b){
        super(l,b);
    }

    public void inch(){
        inch = 2.1* rectarea;
        System.out.println("In inch : "+inch);
    }
    public void feet(){
        feet = 30.40* rectarea;
        System.out.println("In inch : "+inch);
    }
}
