package inheritance;

class s {
    int a = 10;
    public void add(){
        System.out.println("from s class");
    }
}
 class d extends s{
    int b= 20;
    public void sd(){
        System.out.println(" from d class");
        
    }
 }
 interface tg{
        public void pri();
 }
class finall extends d implements tg {
        @Override
        public void pri() {
            int sum = a+b;
        System.out.println("callled from interface and sum of A + B is :- " + sum);
            
        }

}

public class impliment {
    public static void main(String[] args) {
         finall F = new finall();
         F.add();
         F.sd();
         F.pri();

    }
}
