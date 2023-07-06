package Algorithms.SortingAlgos;

public class SelectionSort {
    public static void main(String[] args) {
        int arr [] = {2,4,6,3,1,8};
        System.out.println("Sorted Array is ");
        printArray(selectionSortAlgo(arr));
    }
    public static void printArray (int [] arr ){
        for(int i =0 ;i< arr.length;i++){
            System.out.println(arr[i] + " ");
        }
    }
    public static  int [] selectionSortAlgo (int [] arr) {
        for(int i =0 ;i< arr.length-1; i++){
            int min_ind = i;
            for(int j =i+1;j< arr.length; j++){
                if(arr[j]<arr[min_ind]){
                    min_ind = j;
                }
            }
            int temp =arr[min_ind];
            arr[min_ind] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}
