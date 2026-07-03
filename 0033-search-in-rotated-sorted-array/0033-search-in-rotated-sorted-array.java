class Solution {
    public int search(int[] arr, int target) {
        // int left=0;
        int right= arr.length;
        for(int i=0;i<right;i++){
            if(arr[i]==target){
                return i;
            }
        }
        // while(left<=right){
        //     int mid = left+(right - left)/2;
        //     if(arr[mid]== target){
        //         return mid;
        //     }
        //     if(arr[left]<=arr[mid]){
        //         if(arr[left]<=target && arr[mid]>target){                    
        //             right=mid-1;
        //         } else{
        //             left=mid+1;
        //         }        
        //     } 
        //     else if(arr[right]>=arr[mid] ){
        //         if(arr[mid]<target && arr[right]>=target){
        //             left=mid+1;
        //         } else{
        //             right=mid-1;                    
        //         } 
        //         // return arr[left];
        //     }
        // }
        return -1;
    }
}