public class stringprintreverse {
    public static void main(String[] args){
        String str="hello";
        for(int i=0;i<str.length();i++){ // print every character of string
            System.out.println(str.charAt(i));

        }
        for(int i=str.length()-1;i>=0;i--){  //reverse of string
            System.out.println(str.charAt(i));

        }


        String str1="eye";
        String rev="";
        for(int i=str.length()-1;i>=0;i--){  //reverse of string
            rev+=str1.charAt(i);

        }
        System.out.print(rev);

if(str1.equals(rev)){
    System.out.print("palindrome");
}
    }
    else{
        System.out.print("not palindrome");
    }
        }
    
}
