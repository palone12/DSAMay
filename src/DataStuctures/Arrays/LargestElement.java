package DataStuctures.Arrays;
public class LargestElement  {
    public static void main(String[] args) {
        int arr [] = {1,3,5,6,7,67,534};
        System.out.println("Largest Element in array is " + largestInArray(arr));
    }

    public static int largestInArray (int arr []){
        int max = Integer.MIN_VALUE;
        for(int i =0 ;i< arr.length ;i++){
            if(arr[i]> max){
                max= arr[i];
            }
        }
        return max;
    }

}
