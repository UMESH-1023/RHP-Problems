public class TwoUniqueElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1, 4, 5, 4};
        int xor = 0;
        for(int num : arr) xor ^= num;
        // find rightmost set bit
        int setBit = xor & -xor;
        int a = 0, b = 0;
        for(int num : arr) {
            if((num & setBit) != 0) a ^= num;
            else b ^= num;
        }
        System.out.println("Unique elements: " + a + " and " + b);
    }
}