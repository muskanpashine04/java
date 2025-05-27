import java.util.HashSet;
class Hello{
    public static void main(String[]args){
        
        HashSet<Integer> set=new HashSet<>(); //hashset do not include duplicate values like set theory
       set.add(5);
        set.add(5);
         set.add(5);
        System.out.println(set);  //5,6
    }
}