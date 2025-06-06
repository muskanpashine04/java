import java.util.ArrayList;
import java.util.Collections;

public class ComparatorList {
    public static void main(String[] args) {
     ArrayList<String> list =new ArrayList<>();
         
        list.add("khushi");
        list.add("madhu");
        list.add("tom");
        list.add("cat");
        list.add("jiya");
        Collections.sort(list,(a,b)->a.compareTo(b));
        System.out.println("list is"+list);
    }
}
