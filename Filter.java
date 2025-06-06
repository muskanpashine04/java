import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class Hello{
    public static void main(String[] args) {
        ArrayList<Integer>data=(ArrayList<Integer>) list.stream().filter(a->a>2).collect(Collectors.toList());
        System.out.println(data);
      //  Collections.sort(list, new Comparator<String>(){
        //    public int compare(String a,String b){
          //      return a.compareTo(b);
            //}
       // });
    }
}

//collections.sort(list,(a,b)->a.compareTo(b));
//System.out.println(list);
//make a list from having number 1 to 10 and then apply filter to store the number greater than 2 and then print by multiplying by 2 to print the even list of numbers->map,filter