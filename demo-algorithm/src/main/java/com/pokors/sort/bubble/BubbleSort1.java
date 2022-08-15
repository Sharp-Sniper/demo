package com.pokors.sort.bubble;

public class BubbleSort1 {

    /**
     * 最外层的 for 循环每经过一轮，剩余数字中的最大值就会被移动到当前轮次的最后一位，中途也会有一些相邻的数字经过交换变得有序。总共比较次数是 (n-1)+(n-2)+(n-3)+…+1(n−1)+(n−2)+(n−3)+…+1。
     * 这种写法相当于相邻的数字两两比较，并且规定：“谁大谁站右边”。经过 n-1n−1 轮，数字就从小到大排序完成了。整个过程看起来就像一个个气泡不断上浮，这也是“冒泡排序法”名字的由来。
     * @param arr
     */
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        // 在大厂面试中，有一道非常经典的数字交换题目：如何在不引入第三个中间变量的情况下，完成两个数字的交换。

        // 1. 数学技巧——先加后减 可能导致数字越界
        /*arr[j] = arr[j] + arr[i];
        arr[i] = arr[j] - arr[i];
        arr[j] = arr[j] - arr[i];*/

        // 2. 数学技巧——先减后加 可能导致数字越界
        /*arr[j] = arr[i] - arr[j];
        arr[i] = arr[i] - arr[j];
        arr[j] = arr[j] + arr[i];*/

        // 3. 位运算 不会导致数字越界
        /*arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];*/
    }
}
