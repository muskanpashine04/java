class Hello{
public static void main(String[] args) {
        Runnable r=new Runnable(){
            public void run(){
                System.out.println("runnable using anomous class");
            }

        };r.run();
}

}
    public class RunnableLambda {
    public static void main(String[] args) {
        Runnable r=()->System.out.println("runnable using lambda expression");
        r.run();
    }
}
