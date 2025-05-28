import java.util.TreeSet;
//import java.util.HashSet;
class Hello{
    public static void main(String[] args) {
        int[] arr={3,21,34,4,456,667};
         //HashSet<Integer> set =new HashSet<>(); //hashset is used to remove duplicate values
        TreeSet<Integer> set =new TreeSet<>();// treeset removes duplicate value and also sort the data
        for(int i:arr){
            set.add(i);
        }
        System.out.println(set);
    }
}