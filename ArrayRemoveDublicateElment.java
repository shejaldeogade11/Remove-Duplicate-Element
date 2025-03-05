package Array;
import java.util.HashSet;
public class ArrayRemoveDublicateElment {
public static int removeDublicate(int arr[]){

    // this brute force approach  SC O(n) its work both sorted and unsorted array

    // HashSet<Integer> set =new HashSet<>();//O(n^2logn)
    // for(int i=0;i<arr.length;i++){
    //     set.add(arr[i]);
    // }
    // int k=set.size();
    // int j=0;                           //
    // for(int x: set){  //O(n)
    //     arr[j++]=x;
    // }
    // return k;


    // //optimal solution with  TC O(n) SC O(n) its only work for sorted arr

    int j=0;
    for(int i=1;i<arr.length;i++){
        if(arr[j] != arr[i]){
            j++;
            arr[j] = arr[i];
            
        }
    }
    return j+1;

} 

public static void main(String[] args) {
    int arr[]={1,2,3,3,4,4,1,2};
    int k=removeDublicate(arr);
    System.out.println("After removing dublicate element");
    for(int i=0;i<k;i++){
        System.out.println(arr[i]+" ");
    }
}
}
