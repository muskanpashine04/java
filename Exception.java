class Hello{
    public static void main(String[] args) {
        int a=10;int b=0;//in case of exception whole program does not work i.e hello and hii will not print
        try{ //exception handling by using try and catch block
            int c=a/b; //put what gives exception under try block
            System.out.println(c);
        }
        catch(Exception e){ //write soln in case of exception under catch block
            System.out.println("Divide by zero is not possible"); //System.out.println("e"); print the type of exception
        }
        System.out.println("Hello");
                System.out.println("Hii");

    }
}