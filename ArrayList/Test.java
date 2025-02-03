

// package ArrayList;

import java.util.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Test {

public static void prints(ArrayList<Integer>  list){

    for(int i = 0; i<list.size(); i++){
        System.out.print(list.get(i)+" ");
    }
}

public static void maxElements(ArrayList<Integer> list){
    int max = Integer.MIN_VALUE;

    for(int i = 0; i<list.size(); i++){
max = Math.max(max, list.get(i));
    }
    System.out.println("Max Element of arrays is = "+ max);
}


public static void sorting(ArrayList<Integer> list){
    Collections.sort(list);

}


public static void Reverse(ArrayList<Integer> list){
    for(int i = list.size() -1; i>= 0; i--){
System.out.print(list.get(i)+ " ");
    }
    System.out.println();
}


public static void swap(ArrayList<Integer> list){
    // Check if the list has at least two elements to swap
    if (list.size() > 1) {
        // Swapping the first and last element using set() method
        int temp = list.get(0);
        list.set(0, list.get(list.size() - 1));
        list.set(list.size() - 1, temp);
    }
}
    public static void main(String[] args) {
        ArrayList<Integer> list =  new  ArrayList<>();

list.add(1);
list.add(2);
list.add(99);
list.add(10);
list.add(3);
list.add(4);
list.add(47);
list.add(5);
list.add(6);

swap(list);


prints(list);



   

    }
}
