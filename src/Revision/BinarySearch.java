package Revision;

public class BinarySearch {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        System.out.println(BinarySearch(arr,5));

    }
    public static int BinarySearch (int [] arr , int ele ){
        int start =0 ;
        int end = arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]>ele){
                end = mid -1;
            }
            else if (arr[mid]<ele){
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
