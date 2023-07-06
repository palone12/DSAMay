package Revision;

public class SearchingAlgo {
    public static void main(String[] args) {

        int [] array = {1,2,3,4,5,6,7,8,9};
        int result = SearchNum(5,array);
        System.out.println("Interger found at this index --> " + result);

    }
    public static int SearchNum (int x , int [] arr ){
        for(int i=0 ;i < arr.length ;i++){
            if(arr[i]==x){
                return i;
            }
        }
        return 0;
    }
}
