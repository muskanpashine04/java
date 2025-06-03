class MyThread extends Thread{
    public void run(){
        System.out.println("hello");
        try{ //sleep method always use in try catch block
            Thread.sleep(4000); //to sleep the thread
        }catch(Exception e) {
 System.out.println("hii");
        }
           
        
    }
}

class Hello{
    public static void main(String[] args) {
        MyThread t1=new MyThread();
        t1.start();
    }
}

//hello
//4s
//hii