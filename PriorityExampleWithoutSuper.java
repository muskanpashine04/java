class MyThread extends Thread{
    public void run(){
        for(int i=1;i<+10;i++){
            System.out.println(getName()+"is running with priority"+getPriority());
            Thread.yield();//it will block the thread for some time //time decided by compiler , time not known
        }
    }
}


public class PriorityExampleWithoutSuper {
    public static void main(String[] args) {
        MyThread t1=new MyThread();
         MyThread t2=new MyThread();
         t1.setName("low priority thread"); //to set name
         t2.setName("high priority thread");

         //to set priority
         t1.setPriority(Thread.MIN_PRIORITY);//1
         t2.setPriority(Thread.MAX_PRIORITY);//10 priority

         t1.start();
         t2.start();
    }
    
}
