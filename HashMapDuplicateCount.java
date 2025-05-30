import java.util.HashMap;  //count the each characters that repeated number of times 
class Hello{
    public static void main(String[] args) {
        String str="programming";//output    p=1,r=2
        HashMap<Character, Integer> map=new HashMap<>();
       
         for(char ch:str.toCharArray()){ //to convert string into character array 

            map.put(ch, map.getOrDefault(ch,0)+1);
         }
         System.out.println(map);
    }
}