class Hello{
    public static void main(String[] args) {
        for(int i=0;i<1000000000;i++){//snchronous=> step by step in order
            System.out.println(i);
        }
        System.out.println("hello"); //asynchronous=> it will print hello first then loop //random run order change  //async better for coding
    }
}