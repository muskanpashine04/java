public class missingno {
    public static void main(String[]args){
        int[] arr={1,2,4};
        int sum=0;
        for(i=0;i<arr.length;i++){
            sum +=a[i];
        }
        System.out.println("sum" +sum);
            int n=arr.length+1;

        int sn=n*(n+1)/2;
        System.out.println("sum of n terms" +sn);
        System.out.println("Missing number"+(sum-sn));
    }
    
}
