public class binarysearch {
    public static int binarySearch(){
        int[] arr={1,2,3,4,5,6,7,8};
        int target=3;
        int left=0;
        int right=arr.length-1;
        
        while(right>=left)[
            int mid=(right+left)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(target<arr[mid]){
            right=mid-1;
            }
            else (target>arr[mid]){
                left=mid+1;
                }
                return -1;
        ]
        

    }
    public static void main(String[] args){
        System.out.println(binarySearch());
       
        
    }
    
}
