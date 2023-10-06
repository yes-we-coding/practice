package com.bai.sort.selection.anotherselection;

import java.util.Random;

public class ArrayGenerator {
  
  private ArrayGenerator() {}

  public static Integer[] generateOrderedArray(int n) {

    Integer[] arr = new Integer[n];
    for (var i = 0; i < n; i++) {
      arr[i] = i;
    }
    return arr;
  }
  
  // 生成一个长度为n的随机数组，每个数字的范围是[0, bound]
  public static Integer[] generateRandomArray(int n, int bound) {
    Integer[] arr = new Integer[n];

    Random rdm = new Random();
    for (var i = 0; i < n; i++) {
      arr[i] = rdm.nextInt(bound);
    }
    return arr;
  }
}
