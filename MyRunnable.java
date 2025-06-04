 //multithreading by interface
 class MyRunnable implements Runnable { //runnable is a builtin interface
    public void run(){
       // System.out.println("hii");
       System.out.println(Thread.currentThread().getName()+"hii"); //current thread prints current working thread out of multiple running thread
    }
    
}
class Hello{
    public static void main(String[] args) {
        MyRunnable obj=new MyRunnable();
        Thread t1=new Thread(obj);//pass thre reference obj in thread
        t1.start();
        try {
             t1.join();//it will pause the main thread
        } catch (InterruptedException e) {
            // TODO: handle exception
            //e.printStackTrace();
        }
       System.out.println("hello");
    }
}

//without join
//hello
//hii

//with join
//hii
//hello

//with current thread and with join
//Thread0 hii
//hello
