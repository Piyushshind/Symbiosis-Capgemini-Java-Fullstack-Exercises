public class Area1 extends Converter {
   
    Area1(double l , double b){
        super(l, b);
    }
    public static void main(String[] args) {
        Area1 a1 = new Area1(10,20);
        a1.rectangle();
        a1.inch();
        a1.feet();
    }
}
