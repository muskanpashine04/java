class Hello{
    public static void main(String[] args) {
        int [] arr={1,2,3,4};
        try{ //we can use multiple catch with a single try but only one catch run at a time depending on type of input 
            System.out.println(arr[9]);
        }
        catch(Exception e){ //Exception is a class and e is a variable that store the reference
            System.out.println(e);//printing e will print the type of exception //Array index out of bound exception
        }
        System.out.println("hello");
    }
}