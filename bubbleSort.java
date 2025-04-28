public class bubbleSort {
    static void bubbleSort(int[] arr){
        
        for(int i=0;i<arr.length;i++){
        for(int j=0;i<arr.length-1-i;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                 arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
            for(int i:arr){
                System.out.println(arr[i]);
            }
            
        }
            
        }
    }
    public static void main(String [] args){
        int[] arr={2,3,65,34,22,4,2,5};
        
        System.out.println(bubbleSort(arr));

    }
}
