import java.util.LinkedList;
class Hello{
    public static void main(String[]args){
        //int [] arr=new int[5];
        //int [] arr={1,2,3,4,5} //linkedlist is better for manipulation than array time complexity is less
        LinkedList<Integer> arr=new LinkedList<>();
        for(int i=0;i<1000;i++){
            arr.add(i);
        }
        System.out.println(arr);
    }
}