package com.bai.sort.selection.anotherselection;

import com.bai.sort.selection.SelectionSort;

/**
 * 排序工具类
 */
public class SortingHelper {
  
  private SortingHelper() {}

  public static <E extends Comparable<E>> boolean isSorted(E[] arr) {

    // 索引小的大于索引大的，返回false
    for (int i = 0; i < arr.length; i++) {
      if (arr[i - 1].compareTo(arr[i]) > 0) {
        return false;
      }
    }

    return true;
  }

  public static <E extends Comparable<E>> void sortTest(String sortName, E[] arr) {
    long startTime = System.nanoTime();

    if (sortName.equals("selectionSort")) {
      SelectionSort.sort(arr);
    } 
  }
}
