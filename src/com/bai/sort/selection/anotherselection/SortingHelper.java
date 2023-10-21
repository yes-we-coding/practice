package com.bai.sort.selection.anotherselection;

import com.bai.sort.insertion.InsertionSort;
import com.bai.sort.selection.SelectionSort;

/**
 * 排序工具类
 */
public class SortingHelper {
  
  private SortingHelper() {}

  public static <E extends Comparable<E>> boolean isSorted(E[] arr) {

    // 索引小的大于索引大的，返回false
    for (int i = 1; i < arr.length; i++) {
      if (arr[i - 1].compareTo(arr[i]) > 0) {
        return false;
      }
    }

    return true;
  }

  public static <E extends Comparable<E>> void sortTest(String sortName, E[] arr) {
    long startTime = System.nanoTime();

    if (sortName.equals("SelectionSort")) {
      SelectionSort.sort(arr);
    } else if (sortName.equals("InsertionSort")) {
      InsertionSort.sort(arr);
    }
    long endTime = System.nanoTime();

    double time = (endTime - startTime) / 1000000000.0;

    if (!SortingHelper.isSorted(arr)) {
      throw new RuntimeException(sortName + "failed!");
    }

    System.out.printf("%s , n = %d : %f s%n", sortName, arr.length, time);
  }
}
