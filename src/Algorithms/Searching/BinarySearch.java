package Algorithms.Searching;
import  java.util.*;
public class BinarySearch {
    public static void main(String[] args) {
        int arr [] = {2,4,7,45,32,11,233};
        Arrays.sort(arr);
        System.out.println(binarySearch(arr,45));

    }
    public static int binarySearch (int [] arr ,int ele) {
        int start = 0;
        int end = arr.length -1;
        while(start<=end){
            int mid = (start + end)/2;
            if(arr[mid] >ele){
                end= mid-1;
            }
            else if (arr[mid]<ele){
                start = mid+1;
            }
            else  {
                return mid;
            }
        }
        return -1;
    }
}
