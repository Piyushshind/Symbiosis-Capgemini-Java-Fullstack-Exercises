
class w{
    int i = 10;
    public void get(){
        System.out.println("hello" + i);
    }
      public static void set(){
        System.out.println("hello" + "piyush");
    }
}
class g extends w{
     int i = 56;
    public void get(){
        System.out.println("word" + i);
    }
       public static void set(){
        System.out.println("word" + "piyush");
    }
}
class overloading {
    public static void main(String[] args) {
        g j = new g();
        j.get();
        j.set();
        System.out.println(j.i);
    }
}