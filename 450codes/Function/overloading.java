
public class overloading {
    public static int cal (){
        int k=0;
       return k;
    }
    public static int cal (int a, int b , int c){
        int k=a+b+c;
       return k;
    }
    public static int cal (int a , int b){
        int k=a+b;
       return k;
    }
    public static void main(String args[]){
         System.out.println(cal(4,6,2));
         System.out.println(cal(4,6));
         System.out.println(cal());
    }
}
