package binarysearch;

/**
 * @author Pavel S Varchenko
 * @since 16.05.2018
 */
public class BinarySearch {

    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        int[] arr = {2, 3, 4, 5, 10, 40};
        int n = arr.length;
        int x = 10;
        int result = bs.binarySearch(arr, x);

        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at " +
                    "index " + result);
    }

    private int binarySearch(int[] arr, int x) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - 1) / 2;
            if (arr[m] == x) {
                return m;
            }
            if (arr[m] < x) {
                l = m + l;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }
}
