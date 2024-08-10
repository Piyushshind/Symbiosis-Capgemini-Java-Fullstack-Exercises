public class tryCatch {
    public static void main(String[] args) {
        int res;
        int n1 = 100;
        int n2 = 50;
        int n3 = 50;
        try{
            res = n1 /(n2-n3);
            System.out.println("Result " + res);
        }catch(ArithmeticException  e){
            System.out.println(" Exception" +e);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
