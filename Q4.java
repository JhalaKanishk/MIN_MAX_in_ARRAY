import java.util.Arrays;
class Pair {
    public long min;
    public long max;
}

public class Q4 {
    static Pair getMinMax(long arr[], long n) {
        Pair minmax = new Pair();
        Arrays.sort(arr);
        minmax.min = arr[0];
        minmax.max = arr[arr.length-1];
        return minmax;
    }

    public static void main(String[] args) {
        long arr[] = { 1000, 11, 445, 1, 330, 3000 };
        int arr_size = arr.length;
        Pair minmax = getMinMax(arr, arr_size);
        System.out.println("Minimum element is " + minmax.min);
        System.out.println("Maximum element is " + minmax.max);
    }
}
