import sun.lwawt.macosx.CSystemTray;

public class BinarySearch {
    public static boolean binarySearch(int[] arr, int key, int fromIdx, int toIdx) {
        int middleIdx = (fromIdx + toIdx) / 2;
        if (fromIdx > toIdx) {
            return false;
        }
        if (arr[middleIdx] == key) {
            return true;
        }
        if (arr[middleIdx] > key) {
            return binarySearch(arr, key, middleIdx + 1, toIdx);
        }
        return binarySearch(arr, key, fromIdx, middleIdx - 1);
    }

    public static boolean binarySearch(int[] arr, int key) {
        return binarySearch(arr, key, 0, arr.length - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 21, 34, 45, 67, 89};
        System.out.println(binarySearch(arr, 12));
    }
}
