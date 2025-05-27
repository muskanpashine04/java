import java.util.HashSet;
class Hello{
    public static void main(String[]args){
        int[] arr={1,2,3,4,4,5,6,6,7};
        HashSet<Integer> set=new HashSet<>(); //hashset do not include duplicate values like set theory
       for(int i=0;i<arr.length;i++){
        set.add(arr[i]);
       }
        System.out.println(set);  
    }
}
/*-----------------------------------------------------------------------------------------

import java.util.HashSet;
class Hello{
    public static void main(String[]args){
        int[] arr={1,2,3,4,4,5,6,6,7};
        HashSet<Integer> set=new HashSet<>(); //hashset do not include duplicate values like set theory but do not sort
        set.add("CA");
        set.add("Ba");
       
         set.add("Ar");
       
        System.out.println(set);  //Set give ouput in random order
    }
}*/