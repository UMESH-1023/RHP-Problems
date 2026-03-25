import java.util.Arrays;

public class RightMaximum {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 5, 4};
        int n = arr.length;
        int[] rightMax = new int[n];
        rightMax[n-1] = -1; // no right element
        int max = arr[n-1];
        for(int i = n-2; i >= 0; i--) {
            rightMax[i] = max;
            max = Math.max(max, arr[i]);
        }
        System.out.println("Right Maximums: " + Arrays.toString(rightMax));
    }
}