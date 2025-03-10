package Arrays;


public class sort_0s1s2s {

    public static void sort(int a[]){
        int m = 0, l = 0, h = arr.length - 1;

        while (m<= h) {
            if(a[m] == 0){
                swap(a[l], a[m])
                l++;
                m++;
            }
            if(a[m] == 1){
                m++;
            }
            if(a[m] == 2){
                swap(a[m], a[h])
                h--;

                
            }
        }
    }
    public static void main(String[] args) {
        int a[] ={ 1,2,1,2,0,0};
    }
}
