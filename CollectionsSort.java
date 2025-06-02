import java.util.ArrayList;
import java.util.Collections;

class Hello{
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();//list is a variable and new is a keyword
        list.add(1);
        list.add(0);
        list.add(5);
 Collections.sort(list); //to use collections you must import it //to sort iton basis of only one attribute
    }
}
//[0,1,5]