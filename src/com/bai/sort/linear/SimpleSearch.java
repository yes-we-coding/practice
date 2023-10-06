package com.bai.sort.linear;

/**
 * int 基础类型查找
 */
public class SimpleSearch {

    public SimpleSearch() {}

    public static int search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
