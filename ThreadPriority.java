class A extends Thread{
   public void run(){
      System.out.println("Thread A Starts");
      for(int i=0;i<=4;i++){
          System.out.println("Thread A: "+i);
      }
      System.out.println("Thread A Exits");
    }
}
class B extends Thread{
    public void run(){
        System.out.println("Thread B Starts");
        for(int i=0;i<=4;i++){
            System.out.println("Thread B: "+i);
        }
        System.out.println("Thread B Exits");
      }
}
class C extends Thread{
    public void run(){
        System.out.println("Thread C Starts");
        for(int i=0;i<=4;i++){
            System.out.println("Thread C: "+i);
        }
        System.out.println("Thread C Exits");
      }
}

public class ThreadPriority{
  public static void main(String args[]){
        A oba=new A();
        B obb=new B();
        C obc=new C();
        oba.setPriority(Thread.MIN_PRIORITY);
        obb.setPriority(oba.getPriority()+2);
        obc.setPriority(Thread.MAX_PRIORITY);
        oba.start();
        obb.start();
        obc.start();
        System.out.println("Main Thread Exits");
  }
}
