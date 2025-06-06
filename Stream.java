import java.util.*;
public class Stream {
public static void main(String[] args) {
     ArrayList<Integer> list =new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(6);
        list.add(9);
        list.add(2);
//  List<Integer> data=     list.stream().filter(a->a>2).collect(Collectors.toList());
        //  System.out.println(data);
              
          int sum=  list.stream().reduce(0,(a,b)->a+b);
          System.out.println(sum);







             
        
}
    
}