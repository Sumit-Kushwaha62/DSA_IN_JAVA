//package Easy;
import java.util.*;
public class interSectionOfArray {

    public static void Intersection(int arr1[], int arr2[]){


ArrayList<Integer> list  = new ArrayList<>();

for(int i = 0; i<arr1.length; i++){
    for(int j = 0; j<arr2.length; j++){
        if(arr1[i] == arr2[j]){
            list.add(arr1[i], arr2[j]);
        }

    }
}
System.out.print(list);

    }
    public static void main(String[] args) {
        int arr1[] = { 1,2,3,4};
        int arr2[] = { 1,2,3,4,5};

        Intersection(arr1, arr2);
        
    }
}
