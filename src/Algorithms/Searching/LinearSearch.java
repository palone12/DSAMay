package Algorithms.Searching;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter element to be searched");
        int element = sc.nextInt();
        int arr [] = {1,2,3,4,5,6,7,8,9};
        System.out.println("Element fount at " +  Search(arr,element));

    }
    public static int Search(int [] arr ,int ele) {
        for(int i =0; i<arr.length; i++)
            if (arr[i] == ele) {
                return i;
            }
        return -1;
    }
}
