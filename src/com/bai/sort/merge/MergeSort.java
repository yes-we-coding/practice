package com.bai.sort.merge;

import java.util.Arrays;

/**
 * 归并排序
 */
public class MergeSort {

    public MergeSort() {

    }

    /**
     * 排序方法
     *
     * @param arr 要排序的数组
     * @param <E> 泛型
     */
    public static <E extends Comparable<E>> void sort(E[] arr) {

    }

    // 合并两个有序的区间 arr[l, mid] 和 arr[mid + 1, r]
    private static <E extends Comparable<E>> void merge(E[] arr, int l, int mid, int r) {
        E[] temp = Arrays.copyOfRange(arr, l, r + 1);

        int i = l, j = mid + 1;

        // 每轮循环为arr[k]赋值
        for (int k = l; k <= r; k++) {
            if (i > mid) {
                arr[k] = temp[j - l]; j++;
            } else if (j > r) {
                arr[k] = temp[i - l]; i++;
            } else if (temp[i - l].compareTo(temp[j - l]) <= 0) {
                arr[k] = temp[i - l]; i++;
            } else {
                arr[k] = temp[j - l]; j++;
            }
        }
     }
 }
