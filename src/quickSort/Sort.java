package quickSort;

/**
 * Created by brilliant_yu on 9/8/16.
 */
public class Sort {


    public static void sort(int[] a, int low, int high){
        if(low>=high) return;
        int pivot = partition(a,low,high);
        sort(a,low,pivot-1);
        sort(a,pivot+1,high);
    }

    public static int partition(int[] a, int low, int high){
        int i = low;
        int j = high+1;
        int pivotValue = a[low];
        while(true){
            while(pivotValue >= a[++i]) if(i == high) break;
            while(pivotValue < a[--j]) {}//break;
            if(i>=j) break;
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
        int temp = a[low];
        a[low] = a[j];
        a[j] = temp;
        return j;
    }





    public static void main(String[] args){
        int[] a = {6,5,4,3,2,1};
        sort(a,0,a.length-1);
        for (int x : a) {
            System.out.print(x+"\t");
        }
    }
}
