package PatternPrograms;

import java.util.HashSet;

public class SubsetOfArray {
    public static void main(String[] args) {
        int arr1[] = { 11, 1, 13, 21, 3, 7 };
        int arr2[] = { 11, 3, 7, 23 };
        if(isSubset(arr1,arr2))
            System.out.println("Array 2 is subset of Array 1.");
        else
            System.out.println("Array 2 is not subset of Array 1.");
    }

    public static boolean isSubset(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : arr1)
            set.add(num);
        for(int num : arr2) {
            if(!set.contains(num))
                return false;
        }

        return true;
    }
}