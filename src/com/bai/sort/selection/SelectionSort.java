package com.bai.sort.selection;

import com.bai.sort.common.Student;

/**
 * 选择排序
 */
public class SelectionSort {

    public SelectionSort() {}

    public static <E extends Comparable<E>> void sort(E[] arr) {

        for (int i = 0; i < arr.length; i++) {
            // 选择arr[i...n]中的最小值
            int maxIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j].compareTo(arr[maxIndex]) < 0) {
                    maxIndex = j;
                }
            }
            swap(arr, i, maxIndex);
        }
    }

    private static <E> void swap(E[] arr, int i, int j) {
        E temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Integer[] arr = {1, 4, 2, 3, 6, 5};

        SelectionSort.sort(arr);
        for (Integer e : arr) {
            System.out.print(e + " ");
        }
        System.out.println();

        Student[] students = { new Student("River", 98),
                new Student("White", 100),
                new Student("Dragon", 65) };
                            
        SelectionSort.sort(students);

        for (Student student : students) {
            System.out.print(student + " ");
        }
        System.out.println();
    }
}

