import java.util.ArrayList;
class Hello{
    public static void main(String[]args){
       // int [] arr=new int[5];  static array length fixed
        ArrayList<String> arr=new ArrayList<>(); //dynamic array
        arr.add("hello"); // add simply add the element
         arr.add("hiii");
          arr.set(1,"bye"); //set replace the element
           arr.add(0,"byeeeeeeeeeeeee");
            arr.add("hiiiiiiiii");
             arr.remove(0); //delete the element
             //arr.clear(); //delete complete array
             System.out.println(arr);
    }
}



