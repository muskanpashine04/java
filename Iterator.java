import java.util.*;
class abcd{
    public static void main (String [] args){
        ArrayList<String> names=new ArrayList<>();
        names.add("ravi");
        names.add("anjali");
        names.add("soham");
        names.add("priya");
        names.add("amit");
        names.get(3);
        System.out.println(names);
        Iterator<String> it=names.iterator();
        System.out.println(it.hasNext());
        while(it.hasNext()){
            String element=it.next();
            System.out.println(element);
            if(element.endsWith("i")){
                it.remove();
                        }
        }System.out.println(names);
        
    }
}

//[ravi,anjali,soham,priya,amit]
//true
//ravi
//anjali
//soham
//priya
//amit
//[ravi,soham,priya]