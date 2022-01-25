
class NewThread implements Runnable{
    String name;
    int time1;
    int x;
    Thread t;
    NewThread(String threadname,int time,int x){
        name=threadname;
        time1=time;
        this.x=x;
        t=new Thread(this,name);
        t.start();
    }
    public void run(){
        try{
            for(int i=x;i>0;i--){
                System.out.println(name);
                Thread.sleep(time1);
            }
        }
        catch(Exception e){
            System.out.println(name+"Interrrupted");
        }
        System.out.println(name+"exiting");
    }
}
public class MultiThread {
    public static void main(String args[]){
        new NewThread("BMS College of Engineering", 1000, 2);
        new NewThread("CSE", 2000, 10);
    }
}
