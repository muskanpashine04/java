class Hello{
    public static void main(String[] args) {
        String str=null;
        try{ //we can use multiple catch with a single try but only one catch run at a time depending on type of input 
            System.out.println(str.toUpperCase());
        }
        catch(Exception e){ //Exception is a class and e is a variable that store the reference
            System.out.println(e);//printing e will print the type of exception //Null Pointer Exception in case we pass null value in string
        }
        System.out.println("hello");
    }
}