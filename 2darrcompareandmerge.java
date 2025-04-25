public class 2darrcompareandmerge {
    public static void main(String[] args){
        int[] arr={1,2,3,4};
        int[] arr1={2,3,4,5};
        int count=0;
        int m=new int[arr.length+arr1.length]
        for(int i=0;i<arr.length;i++){  //to print 1st array in new array
            m[i]=arr[i];
        }
        for(int j=0;j<arr1.length;j++){   //to print 2nd array in new array
            m[arr.length+j]=arr[j];
        }
        for(int k=0;k<m.length;k++){  //to print the merge array
            System.out.print(m[k]);
        }



        for(int i=0;i<arr.length;i++){  //count no. of equal elements
            for(int j=0;j<arr1.length;j++){
                if(arr[i]==arr1[j]){
                    count++;
                }
            }
            
        }
        System.out.print(count);
    }
    
}
