package Algorithms.SortingAlgos;

public class InsertionSort {
    public static void main(String[] args) {
        int arr [] = {2,3,4,1,5};
        printSortedArray(InsertionSortAlgp(arr));


    }
    public static int []   InsertionSortAlgp (int [] arr){
        int n = arr.length;
        for(int i =1 ;i< n; i++){
            int j = i-1;
            int temp =arr[i];
            while(j>=0 && arr[j]>temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
        return arr;

    }
    public static void printSortedArray (int [] arr){
        for(int i =0 ;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
