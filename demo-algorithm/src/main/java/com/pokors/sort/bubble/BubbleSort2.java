package com.pokors.sort.bubble;

public class BubbleSort2 {

    /**
     * 最外层的 for 循环每经过一轮，剩余数字中的最大值仍然是被移动到当前轮次的最后一位。这种写法相对于第一种写法的优点是：如果一轮比较中没有发生过交换，则立即停止排序，因为此时剩余数字一定已经有序了。
     *
     * @param arr
     */
    public static void bubbleSort(int[] arr) {
        boolean swapped = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (!swapped) {
                break;
            }
            swapped = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    swapped = true;
                }
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
