//multithreading => multiple task at one time //optimisation of code
//thread which execute task   // mutiple thread works in parallel
//thread creation using 1.inheritance and 2.interface
class MyThread extends Thread{ //thread creation using inheritance //mythread is custom thread
    public void run(){ //always use run it is predefined
        System.out.println("hello");
    }
}

class Hello{//first always main thread will call and inside it all method will be printed
    public static void main(String[] args) { //main is a bydfault thread created by JVM
        MyThread t1=new MyThread(); //overiding method object creation
        t1.start();//always use start method to call run function
        System.out.println("hiii");
    }
}

//hii as main thread run first
//hello