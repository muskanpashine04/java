import java.util.HashMap;//hashmap used to save time n^2
//import java.util.HashSet;
class Hello{
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>(); //used to store data in pair- key and value  //key cannot be duplicate if it is then it only print value once ,  value can be duplicate but key cannot be
        map.put("id0",1);
        map.put("id1",2);
        map.put("id2",100986);
        System.out.println(map.getOrDefault("id0",0));//give te data if present and if not give the default value
        //map.get();//used to get a particular value

        System.out.println(map.keySet());
        System.out.println(map.values());
        map.forEach((key,value) -> { //act as a loop and print all values
            System.out.println(key+value);
        });
       
    }
}