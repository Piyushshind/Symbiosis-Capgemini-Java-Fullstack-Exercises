package inheritance;

class s {
    public void add(){
        System.out.println("from s class");
    }
}
 class d extends s{
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
        System.out.println("callled  ...... from interface");
            
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
