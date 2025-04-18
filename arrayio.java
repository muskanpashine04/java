
import java.util.Scanner;
class array{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        System.out.println("Enter elements of array");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){ //input elements of array
            arr{i}=sc.nextInt();
        }

        for(int j=0;j<arr.length;j++){ //print array elements
            System.out.println(arr[j]);
        }
        
        
        for(int j=arr.length-1;j>=0;j--){ //reverse of array
            System.out.println(arr[j]);
        }
        

       int sum=0;
       for(int j=0;j<arr.length;j++){ //sum of array elements
        sum+=arr[j];
        
    }
    
    System.out.println("Sum is" +sum);
       

       
    }
}