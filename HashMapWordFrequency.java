import java.util.HashMap;  //count the frequency of words in a string 
class Hello{
    public static void main(String[] args) {
        String str="java is programming and programming is java";// java=2,
        String[] newStr=str.split("");
        HashMap<Character, Integer> map=new HashMap<>();

        for(String ch : newStr){ //to convert string into character array 

            map.put(ch, map.getOrDefault(ch,0)+1);
         }
         System.out.println(map);
         
    }
}