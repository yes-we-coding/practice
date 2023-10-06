package com.bai.sort.linear;

import com.bai.sort.common.Student;

/**
 * 泛型线性查找
 */
public class LinearSearch {

    private LinearSearch() {}

    public static <E> int search(E[] data, E target) {

        for (int i = 0; i < data.length; i++) {
            if (data[i].equals(target)) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Integer[] data = {24, 43, 56, 12, 98, 340};

        int res = LinearSearch.search(data, 12);
        System.out.println(res);

        int res2 = LinearSearch.search(data, 34);
        System.out.println(res2);

        Student[] students = {new Student("River"),
                new Student("White"),
                new Student("Dragon")};

        Student student = new Student("White");

        int res3 = LinearSearch.search(students, student);
        System.out.println(res3);
    }
}
