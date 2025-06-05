class Hello {
    public static void main(String[] args) {
        System.out.println("look here");
        Thread t1=new Thread (()->{ //thread making without using class
            System.out.println(("hello"));
        });

//try {
//    Thread.sleep(2000);
//} catch (InterruptedException e) {
    // TODO Auto-generated catch block
//    e.printStackTrace();
//System.out.println("print at last");
   // }
         Thread t2=new Thread (()->{
            System.out.println(("hii"));
        });
        t1.start();
        t2.start();
    }
    
}


//look here
//hello
//hii


//look here
//hello
//hii
//print at last