class Solution {
    public void reverseString(char[] s) {
        int low = 0;
        int high = s.length - 1;

        while(low < high) {
            swap(s, low, high);
            low++;
            high--;
        }
    }

    private void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}