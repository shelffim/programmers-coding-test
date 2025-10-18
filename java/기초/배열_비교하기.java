class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int arr1Len = arr1.length;
        int arr2Len = arr2.length;
        if (arr1Len == arr2Len) {
            int arr1Sum = getSum(arr1);
            int arr2Sum = getSum(arr2);
            if (arr1Sum == arr2Sum) {
                return 0;
            } else {
                return arr1Sum > arr2Sum ? 1 : -1;
            }
        } else {
            return arr1Len > arr2Len ? 1 : -1; 
        }
    }
    
    private int getSum(int[] arr) {
        int sum = 0;
        for(int a: arr) {
            sum += a;
        }
        return sum;
    }
}

// Integer.compare(arr1Sum, arr2Sum)