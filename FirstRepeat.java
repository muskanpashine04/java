import java.util.HashSet;
class Hello{
    public static void main(String[]args){
        int[] arr={1,2,2,3,4,4,5,6,6,7};
        HashSet<Integer> set=new HashSet<>(); //hashset do not include duplicate values like set theory
       for(int i=0;i<arr.length;i++){
        if(set.contains(i)){ //if will work in true case
System.out.println(arr[i]);  //it will print duplicate value
        }
        set.add(arr[i]); //it will print rest values which are not duplicate 
       }
        
    }
}