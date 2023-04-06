public class binary {
    public static void main(String[]args){ 
    
        int[] arr={12,45,8,-3,74,76,8,2465,6,98};
        int target=6;
        int ans=binarysearch(arr,target);
        System.out.print(ans);

    }
    static int binarysearch(int[] arr,int target){
        int start =0;
        int end=arr.length-1;
        while(start<=end){

            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;

            }else if(target>arr[mid]){
                start =mid+1;

            }else{
                return mid;
            }
        }
        return -1;
    }
    
}
  }
*
