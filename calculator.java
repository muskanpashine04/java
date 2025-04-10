import java.util.*;
class calculator {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("enter first number:");

        int b=sc.nextInt();
        System.out.println("enter second number:");
        System.out.println("enter operator:+,-,*,/,%");

     char c=sc.next().charAt(0);
       

        switch(c){
        case '+':
            System.out.println(a+b);
        break;
        case '-':
            System.out.println(a-b);
        break;
        case '*':
            System.out.println(a*b);
            break;
        case '/':
            System.out.println(a/b);
            break;
        case '%':
            System.out.println(a%b);
            break;
        
        default:
            System.out.println("Invalid ");
        
    }
    }

}


