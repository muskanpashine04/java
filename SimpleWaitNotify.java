//using wait and notify

public class SimpleWaitNotify {
    private boolean isSignalled=false;
    public synchronized void sendSignal(){
        isSignalled=true;
        System.out.println("Producer sending signals.........");
        notify();
    }
    public synchronized void waitForSignal(){
        while(isSignalled){
            try {
                System.out.println("consumer waiting for signal..............");
                wait(); //wait will block the below code
            } catch (InterruptedException e) {
                // TODO: handle exception
            }
        }
        System.out.println("consumer got the signal proceeding..............");
    }



    public static void main(String[] args) {
SimpleWaitNotify obj=new SimpleWaitNotify();


       
        Thread consumer=new Thread (()->{ 
            obj.waitForSignal();
        });

        Thread producer=new Thread(()->{
            try {
   Thread.sleep(5000);  //notify in 5 sec
} catch (InterruptedException e) {
   

    }
    obj.sendSignal();

        });

        
        consumer.start();
        producer.start();
    }
    
}
