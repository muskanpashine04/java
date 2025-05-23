import java.util.ArrayList;
import java.util.Collections;
public class Array_List {
    public static void main(String[] args) {
        ArrayList<String>arr=new ArrayList<>();
        arr.add("muskan");
          arr.add("rohit");
            arr.add("om");
              arr.add("madhu");
              System.out.println("before change"+arr);
              arr.add(3,"aditya");
              System.out.println("after change"+arr);
              arr.set(3,"rishabh");
              System.out.println("arraylist is"+arr);
       
        //arr.clear();
        arr.remove(2);
        System.out.println(arr);
        arr.add("abhishek");
         arr.add("muskan");
          arr.add("addi");
           arr.add("aaru");
            arr.add("zehen");
            Collections.sort(arr);
            System.out.println("array list"+arr);
    }
    
}
//output
//before change[muskan, rohit,om , madhu]
//after change[muskan, rohit , om, aditya, madhu]
//arraylist is[muskan, rohit , om, aditya, madhu]
//[muskan, rohit, rishabh, madhu]