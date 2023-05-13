package Algorithms.SortingAlgos;

public class Bublesort {
    public static void main(String[] args) {
        int  [] arr = {4,5,3,2,8,1,6,7};
        printSortedArray(bubbleSortAlg0(arr));

    }
    public static void printSortedArray (int [] arr){
        for(int i =0 ;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int [] bubbleSortAlg0 (int [] arr) {
        int n =arr.length;
        for(int i =0 ;i< n-1; i++){
            for(int j=0 ;j< n-1 -i ;j++){
                if(arr[j]>arr[j+1]){
                    int temp  =arr[j];
                    arr[j] =arr[j+1];
                    arr[j+1] =temp;
                }
            }
        }
        return arr;

    }

}
