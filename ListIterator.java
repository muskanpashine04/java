import java.util.*;
class abcd{
    public static void main (String [] args){
        ArrayList<String> names=new ArrayList<>();
        names.add("ravi");
        names.add("anjali");
        names.add("soham");
        names.add("priya");
        names.add("amit");
        
       
        ListIterator<String> it=names.listIterator();
        
        while(it.hasNext()){
            String element=it.next();
            
            if(element.length()<=4){
                it.set("bye");
                        }
        }System.out.println(names);

        int count=0;
        while(it.hasPrevious()){
            String x=it.previous();
            count++;
            if(count!=names.size()){
                it.set("hello");
            }
        }
        System.out.println(names);
        
    }
}


//[bye,anjali,soham,priya,bye]
//[bye,hello,hello,hello,hello]